package com.demo.pattern.creational.factory_method;

import com.demo.pattern.creational.factory_method.factory.Dialog;
import com.demo.pattern.creational.factory_method.factory.HtmlDialog;
import com.demo.pattern.creational.factory_method.factory.WindowDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        dialog.renderWindow();
    }

    private static void configure() {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
}
