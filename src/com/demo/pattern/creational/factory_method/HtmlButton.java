package com.demo.pattern.creational.factory_method;

public class HtmlButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Click HtmlButton.");
    }
}
