package com.music.artists.dto.discogs;

import java.util.List;
public class Results
{
    private List<String> style;

    private String thumb;

    private String title;

    private String country;

    private List<String> format;

    private String uri;

    private Community community;

    private List<String> label;

    private String catno;

    private String year;

    private List<String> genre;

    private String resource_url;

    private String type;

    private int id;

    public void setStyle(List<String> style){
        this.style = style;
    }
    public List<String> getStyle(){
        return this.style;
    }
    public void setThumb(String thumb){
        this.thumb = thumb;
    }
    public String getThumb(){
        return this.thumb;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return this.country;
    }
    public void setFormat(List<String> format){
        this.format = format;
    }
    public List<String> getFormat(){
        return this.format;
    }
    public void setUri(String uri){
        this.uri = uri;
    }
    public String getUri(){
        return this.uri;
    }
    public void setCommunity(Community community){
        this.community = community;
    }
    public Community getCommunity(){
        return this.community;
    }
    public void setLabel(List<String> label){
        this.label = label;
    }
    public List<String> getLabel(){
        return this.label;
    }
    public void setCatno(String catno){
        this.catno = catno;
    }
    public String getCatno(){
        return this.catno;
    }
    public void setYear(String year){
        this.year = year;
    }
    public String getYear(){
        return this.year;
    }
    public void setGenre(List<String> genre){
        this.genre = genre;
    }
    public List<String> getGenre(){
        return this.genre;
    }
    public void setResource_url(String resource_url){
        this.resource_url = resource_url;
    }
    public String getResource_url(){
        return this.resource_url;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
}