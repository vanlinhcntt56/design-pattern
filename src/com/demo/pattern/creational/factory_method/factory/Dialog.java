package com.demo.pattern.creational.factory_method.factory;

import com.demo.pattern.creational.factory_method.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button button = createButton();
        button.onClick();
    }

    public abstract Button createButton();
}
