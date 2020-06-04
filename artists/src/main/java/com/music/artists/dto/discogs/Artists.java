package com.music.artists.dto.discogs;

public class Artists {

	private String name;

    private String anv;

    private String join;

    private String role;

    private String tracks;

    private int id;

    private String resource_url;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAnv(String anv){
        this.anv = anv;
    }
    public String getAnv(){
        return this.anv;
    }
    public void setJoin(String join){
        this.join = join;
    }
    public String getJoin(){
        return this.join;
    }
    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return this.role;
    }
    public void setTracks(String tracks){
        this.tracks = tracks;
    }
    public String getTracks(){
        return this.tracks;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setResource_url(String resource_url){
        this.resource_url = resource_url;
    }
    public String getResource_url(){
        return this.resource_url;
    }
}
