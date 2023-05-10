package com.challenge.model;

public class RouteDto {

    private String fullUrl;

    private String shortestUrl;

    private Integer accessQuantity;

    public Integer getAccessQuantity() {
        return accessQuantity;
    }

    public void setAccessQuantity(Integer accessQuantity) {
        this.accessQuantity = accessQuantity;
    }

    public String getFullUrl() {
        return fullUrl;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    public String getShortestUrl() {
        return shortestUrl;
    }

    public void setShortestUrl(String shortestUrl) {
        this.shortestUrl = shortestUrl;
    }

    public RouteDto(String fullUrl, String shortestUrl) {
        this.fullUrl = fullUrl;
        this.shortestUrl = shortestUrl;
    }

    public RouteDto(String fullUrl, String shortestUrl, Integer accessQuantity) {
        this.fullUrl = fullUrl;
        this.shortestUrl = shortestUrl;
        this.accessQuantity = accessQuantity;
    }

    public RouteDto(){}

}
