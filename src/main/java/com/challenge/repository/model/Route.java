package com.challenge.repository.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "ROUTE")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String shortestUrl;

    private String fullUrl;

    private Integer access;

    public Route(Integer id, String shortestUrl, String fullUrl, Integer access) {
        this.id = id;
        this.shortestUrl = shortestUrl;
        this.fullUrl = fullUrl;
        this.access = access;
    }

    public Route(String shortestUrl, String fullUrl, Integer access) {
        this.shortestUrl = shortestUrl;
        this.fullUrl = fullUrl;
        this.access = access;
    }

    public Route(){}

    public String getShortestUrl() {
        return shortestUrl;
    }

    public void setShortestUrl(String shortestUrl) {
        this.shortestUrl = shortestUrl;
    }

    public String getFullUrl() {
        return fullUrl;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
