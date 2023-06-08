package com.springtest.pojos;

public class VideoId {
    private String kind;
    private String channelId;
    private String videoId;

    public VideoId() {
    }

    public VideoId(String kind, String channelId, String videoId) {
        this.kind = kind;
        this.channelId = channelId;
        this.videoId = videoId;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}
