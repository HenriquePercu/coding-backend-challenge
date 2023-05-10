package com.challenge.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Runner {

    @Scheduled(initialDelay = 1000 , fixedDelay=Long.MAX_VALUE)
    public void execute(){

    }

}
