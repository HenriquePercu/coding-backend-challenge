package com.challenge.service;

import com.challenge.model.RouteDto;

import java.util.List;

public interface ShortenerUrl {

    RouteDto shortener(RouteDto routeDto);

    RouteDto retrieveUrl(String shortestUrl);

    List<RouteDto> retrieveTopAccessUrl();

}
