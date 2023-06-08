package com.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
//@ComponentScan (basePackages = "com.springtest")
//@EnableAutoConfiguration
//@Configuration
@RestController
public class Main {

    public static void main (String [] args){
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public Salu2 greet(){
        return new Salu2("salu2",
                List.of("Java", "js", "python"),
                new Person("Cachita")
        );
    }

    record Person (String name){} //Esto equivale a montarse una clase
    record Salu2(
            String greet,
            List<String> favProgrammingLang,
            Person person
    ){

    }
}
