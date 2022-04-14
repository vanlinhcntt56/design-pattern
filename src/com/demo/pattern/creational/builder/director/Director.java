package com.demo.pattern.creational.builder.director;

import com.demo.pattern.creational.builder.Builder;
import com.demo.pattern.creational.builder.components.CarType;
import com.demo.pattern.creational.builder.components.Engine;
import com.demo.pattern.creational.builder.components.GPSNavigator;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setGPSNavigator(new GPSNavigator());
    }
}
