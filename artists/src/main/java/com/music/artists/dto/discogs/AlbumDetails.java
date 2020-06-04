package com.music.artists.dto.discogs;

import java.util.List;
public class AlbumDetails
{
    private int id;

    private int main_release;

    private int most_recent_release;

    private String resource_url;

    private String uri;

    private String versions_url;

    private String main_release_url;

    private String most_recent_release_url;

    private int num_for_sale;

    private double lowest_price;

    private List<Images> images;

    private List<String> genres;

    private List<String> styles;

    private int year;

    private List<Tracklist> tracklist;

    private List<Artists> artists;

    private String title;

    private String data_quality;

    private List<Videos> videos;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setMain_release(int main_release){
        this.main_release = main_release;
    }
    public int getMain_release(){
        return this.main_release;
    }
    public void setMost_recent_release(int most_recent_release){
        this.most_recent_release = most_recent_release;
    }
    public int getMost_recent_release(){
        return this.most_recent_release;
    }
    public void setResource_url(String resource_url){
        this.resource_url = resource_url;
    }
    public String getResource_url(){
        return this.resource_url;
    }
    public void setUri(String uri){
        this.uri = uri;
    }
    public String getUri(){
        return this.uri;
    }
    public void setVersions_url(String versions_url){
        this.versions_url = versions_url;
    }
    public String getVersions_url(){
        return this.versions_url;
    }
    public void setMain_release_url(String main_release_url){
        this.main_release_url = main_release_url;
    }
    public String getMain_release_url(){
        return this.main_release_url;
    }
    public void setMost_recent_release_url(String most_recent_release_url){
        this.most_recent_release_url = most_recent_release_url;
    }
    public String getMost_recent_release_url(){
        return this.most_recent_release_url;
    }
    public void setNum_for_sale(int num_for_sale){
        this.num_for_sale = num_for_sale;
    }
    public int getNum_for_sale(){
        return this.num_for_sale;
    }
    public void setLowest_price(double lowest_price){
        this.lowest_price = lowest_price;
    }
    public double getLowest_price(){
        return this.lowest_price;
    }
    public void setImages(List<Images> images){
        this.images = images;
    }
    public List<Images> getImages(){
        return this.images;
    }
    public void setGenres(List<String> genres){
        this.genres = genres;
    }
    public List<String> getGenres(){
        return this.genres;
    }
    public void setStyles(List<String> styles){
        this.styles = styles;
    }
    public List<String> getStyles(){
        return this.styles;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }
    public void setTracklist(List<Tracklist> tracklist){
        this.tracklist = tracklist;
    }
    public List<Tracklist> getTracklist(){
        return this.tracklist;
    }
    public void setArtists(List<Artists> artists){
        this.artists = artists;
    }
    public List<Artists> getArtists(){
        return this.artists;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setData_quality(String data_quality){
        this.data_quality = data_quality;
    }
    public String getData_quality(){
        return this.data_quality;
    }
    public void setVideos(List<Videos> videos){
        this.videos = videos;
    }
    public List<Videos> getVideos(){
        return this.videos;
    }
}