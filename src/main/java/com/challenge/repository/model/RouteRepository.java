package com.challenge.repository.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RouteRepository extends JpaRepository<Route, String> {

    Optional<Route> findByShortestUrl(String shortestUrl);

    @Query(value = "SELECT * from ROUTE ORDER BY ACCESS DESC LIMIT 100", nativeQuery = true)
    List<Route> findTop100(); // TODO considering have 100 as a parameter

    //List<Route> findTop100OrderByAccessDesc();

}
