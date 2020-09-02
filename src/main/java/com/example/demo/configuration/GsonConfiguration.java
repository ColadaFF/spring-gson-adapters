package com.example.demo.configuration;

import com.example.demo.configuration.serialization.LatLngTypeAdapter;
import com.example.demo.domain.LatLng;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GsonConfiguration {

    @Bean
    public Gson gson() {
        return new GsonBuilder()
                .registerTypeAdapter(LatLng.class, new LatLngTypeAdapter())
                .create();
    }
}
