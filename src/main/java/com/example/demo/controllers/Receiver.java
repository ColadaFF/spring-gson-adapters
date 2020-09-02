package com.example.demo.controllers;

import com.example.demo.domain.Location;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Receiver {

    @PostMapping("/location")
    public String receiveLocation(@RequestBody Location location) {
        return location.toString();
    }
}
