package com.music.artists.dto.discogs;

public class Videos {

	private String uri;

    private String title;

    private String description;

    private int duration;

    private boolean embed;

    public void setUri(String uri){
        this.uri = uri;
    }
    public String getUri(){
        return this.uri;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public int getDuration(){
        return this.duration;
    }
    public void setEmbed(boolean embed){
        this.embed = embed;
    }
    public boolean getEmbed(){
        return this.embed;
    }
}
