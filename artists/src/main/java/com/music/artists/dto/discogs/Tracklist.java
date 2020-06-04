package com.music.artists.dto.discogs;

public class Tracklist {
	private String position;

    private String type_;

    private String title;

    private String duration;

    public void setPosition(String position){
        this.position = position;
    }
    public String getPosition(){
        return this.position;
    }
    public void setType_(String type_){
        this.type_ = type_;
    }
    public String getType_(){
        return this.type_;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setDuration(String duration){
        this.duration = duration;
    }
    public String getDuration(){
        return this.duration;
    }
}
