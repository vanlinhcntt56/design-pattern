package com.demo.pattern.creational.method_factory.factory;

import com.demo.pattern.creational.method_factory.Button;
import com.demo.pattern.creational.method_factory.MacButton;

public class MacFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
