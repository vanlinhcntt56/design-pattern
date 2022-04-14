package com.demo.pattern.creational.abstract_factory.factory;

import com.demo.pattern.creational.abstract_factory.Button;
import com.demo.pattern.creational.abstract_factory.WindowButton;

public class WindowFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
