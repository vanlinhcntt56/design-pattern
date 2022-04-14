package com.demo.pattern.creational.abstract_factory;

import com.demo.pattern.creational.abstract_factory.Button;

public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacButton.");
    }
}
