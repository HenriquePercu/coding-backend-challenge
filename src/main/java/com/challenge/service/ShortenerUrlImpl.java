package com.challenge.service;

import com.challenge.model.RouteDto;
import com.challenge.repository.model.Route;
import com.challenge.repository.model.RouteRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShortenerUrlImpl implements ShortenerUrl{

    private final RouteRepository repository;

    public ShortenerUrlImpl(RouteRepository repository) {
        this.repository = repository;
    }

    @Override
    public RouteDto shortener(RouteDto routeDto) {
        String shortestUrl = RandomStringUtils.randomAlphabetic(7);

        repository.save(new Route(shortestUrl, routeDto.getFullUrl(), 0)); // if I have complex mapping objects, considering using MapStruct

        return new RouteDto(routeDto.getFullUrl(),shortestUrl);
    }

    @Override
    public RouteDto retrieveUrl(String shortestUrl) {
        Route route = repository.findByShortestUrl(shortestUrl)
                .orElseThrow(IllegalArgumentException::new); // TODO create a specific exception and in an RestAdvice properly return the error

        route.setAccess(route.getAccess() + 1);

        repository.save(route);

        return new RouteDto(route.getFullUrl(), route.getShortestUrl());
    }

    @Override
    public List<RouteDto> retrieveTopAccessUrl() {

        return repository.findTop100()
                .stream()
                .map(route -> new RouteDto(route.getFullUrl(), route.getShortestUrl(), route.getAccess()))
                .collect(Collectors.toList());
    }
}
