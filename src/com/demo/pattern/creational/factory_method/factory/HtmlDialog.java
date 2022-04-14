package com.demo.pattern.creational.factory_method.factory;

import com.demo.pattern.creational.factory_method.Button;
import com.demo.pattern.creational.factory_method.HtmlButton;
import com.demo.pattern.creational.factory_method.factory.Dialog;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
