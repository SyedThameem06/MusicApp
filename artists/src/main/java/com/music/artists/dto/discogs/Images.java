package com.music.artists.dto.discogs;

public class Images {

	private String type;

    private String uri;

    private String resource_url;

    private String uri150;

    private int width;

    private int height;

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setUri(String uri){
        this.uri = uri;
    }
    public String getUri(){
        return this.uri;
    }
    public void setResource_url(String resource_url){
        this.resource_url = resource_url;
    }
    public String getResource_url(){
        return this.resource_url;
    }
    public void setUri150(String uri150){
        this.uri150 = uri150;
    }
    public String getUri150(){
        return this.uri150;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return this.width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return this.height;
    }
}
