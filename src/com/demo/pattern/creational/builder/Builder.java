package com.demo.pattern.creational.builder;

import com.demo.pattern.creational.builder.components.CarType;
import com.demo.pattern.creational.builder.components.Engine;
import com.demo.pattern.creational.builder.components.GPSNavigator;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
