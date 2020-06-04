package com.music.artists.dto.discogs;

public class Urls
{
    private String last;

    private String next;

    public void setLast(String last){
        this.last = last;
    }
    public String getLast(){
        return this.last;
    }
    public void setNext(String next){
        this.next = next;
    }
    public String getNext(){
        return this.next;
    }
}