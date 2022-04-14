package com.demo.pattern.creational.builder.cars;

import com.demo.pattern.creational.builder.components.CarType;
import com.demo.pattern.creational.builder.components.Engine;
import com.demo.pattern.creational.builder.components.GPSNavigator;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }
}
