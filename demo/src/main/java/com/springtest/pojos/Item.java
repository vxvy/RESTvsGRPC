package com.springtest.pojos;

public class Item {
    private String kind;
    private String etag;
    private VideoId videoId;

    public Item() {
    }

    public Item(String kind, String etag, VideoId videoId) {
        this.kind = kind;
        this.etag = etag;
        this.videoId = videoId;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public VideoId getVideoId() {
        return videoId;
    }

    public void setVideoId(VideoId videoId) {
        this.videoId = videoId;
    }
}
