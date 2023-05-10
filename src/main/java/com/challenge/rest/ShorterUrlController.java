package com.challenge.rest;

import com.challenge.model.RouteDto;
import com.challenge.service.ShortenerUrl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/v1/shortener")
public class ShorterUrlController {

    private final ShortenerUrl shortenerUrl;

    public ShorterUrlController(ShortenerUrl shortenerUrl) {
        this.shortenerUrl = shortenerUrl;
    }

    @PostMapping
    public ResponseEntity<RouteDto> createShortenerUrl(@RequestBody RouteDto routeDto) {

        RouteDto shortenerRouteDto = shortenerUrl.shortener(routeDto);

        return ResponseEntity.ok(shortenerRouteDto);
    }

    @GetMapping("/{shortUrl}")
    public ResponseEntity<RouteDto> getShortenerUrl(@PathVariable String shortUrl){
        return ResponseEntity.ok(shortenerUrl.retrieveUrl(shortUrl));
    }

    @GetMapping("/topaccess")
    public ResponseEntity<List<RouteDto>> getTopAccessUrl(){
        return ResponseEntity.ok(shortenerUrl.retrieveTopAccessUrl());
    }

}
