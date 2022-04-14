package com.demo.pattern.creational.factory_method;

public class WindowButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Click WindowButton.");
    }
}
