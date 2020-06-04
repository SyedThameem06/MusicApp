package com.music.artists.dto.discogs;

public class Pagination {

	private int per_page;

    private int pages;

    private int page;

    private Urls urls;

    private int items;

    public void setPer_page(int per_page){
        this.per_page = per_page;
    }
    public int getPer_page(){
        return this.per_page;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public int getPages(){
        return this.pages;
    }
    public void setPage(int page){
        this.page = page;
    }
    public int getPage(){
        return this.page;
    }
    public void setUrls(Urls urls){
        this.urls = urls;
    }
    public Urls getUrls(){
        return this.urls;
    }
    public void setItems(int items){
        this.items = items;
    }
    public int getItems(){
        return this.items;
    }
}
