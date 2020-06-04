package com.music.artists.dto.discogs;

import java.util.List;
public class DiscogsObject
{
    private Pagination pagination;

    private List<Results> results;

    public void setPagination(Pagination pagination){
        this.pagination = pagination;
    }
    public Pagination getPagination(){
        return this.pagination;
    }
    public void setResults(List<Results> results){
        this.results = results;
    }
    public List<Results> getResults(){
        return this.results;
    }
}