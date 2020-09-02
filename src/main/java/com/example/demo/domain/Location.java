package com.example.demo.domain;

public class Location {
    private final LatLng latLng;
    private final String id;

    public Location(LatLng latLng, String id) {
        this.latLng = latLng;
        this.id = id;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public String getId() {
        return id;
    }

    @Override
    public String  toString() {
        return "Location{" +
                "latLng=" + latLng +
                ", id='" + id + '\'' +
                '}';
    }
}
