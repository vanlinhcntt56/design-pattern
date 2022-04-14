package com.demo.pattern.creational.factory_method.factory;

import com.demo.pattern.creational.factory_method.Button;
import com.demo.pattern.creational.factory_method.WindowButton;

public class WindowDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
