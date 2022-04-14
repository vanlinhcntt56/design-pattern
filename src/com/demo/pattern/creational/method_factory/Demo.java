package com.demo.pattern.creational.method_factory;

import com.demo.pattern.creational.method_factory.factory.GuiFactory;
import com.demo.pattern.creational.method_factory.factory.MacFactory;
import com.demo.pattern.creational.method_factory.factory.WindowFactory;
import com.demo.pattern.creational.method_factory.main.Application;

import java.util.Locale;

public class Demo {

    private static Application configureApplication(){
        Application app;
        GuiFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println("OsName: " + osName);
        if (osName.contains("mac")) {
            factory = new MacFactory();
            app = new Application(factory);
        } else {
            factory = new WindowFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
