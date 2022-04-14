package com.demo.pattern.creational.builder;

import com.demo.pattern.creational.builder.cars.Car;
import com.demo.pattern.creational.builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSUV(builder);

        Car car = builder.getResult();
        System.out.println("Car build: " + car.getCarType());
    }
}
