package com.demo.pattern.creational.abstract_factory.main;

import com.demo.pattern.creational.abstract_factory.Button;
import com.demo.pattern.creational.abstract_factory.factory.GuiFactory;

public class Application {
    private Button button;

    public Application(GuiFactory factory) {
        button = factory.createButton();
    }

    public void paint() {
        button.paint();
    }
}
