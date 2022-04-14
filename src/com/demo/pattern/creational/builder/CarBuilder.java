package com.demo.pattern.creational.builder;

import com.demo.pattern.creational.builder.cars.Car;
import com.demo.pattern.creational.builder.components.CarType;
import com.demo.pattern.creational.builder.components.Engine;
import com.demo.pattern.creational.builder.components.GPSNavigator;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
    this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, gpsNavigator);
    }
}
