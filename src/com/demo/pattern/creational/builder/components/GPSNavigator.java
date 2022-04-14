package com.demo.pattern.creational.builder.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "123 Nam tu liem, Ha noi";
    }

    public GPSNavigator(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}
