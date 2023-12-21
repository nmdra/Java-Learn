package DesignPatterns.AbstractFactory.Example1.factories;

import DesignPatterns.AbstractFactory.Example1.products.AsusGpu;
import DesignPatterns.AbstractFactory.Example1.products.AsusMonitor;
import DesignPatterns.AbstractFactory.Example1.products.Gpu;
import DesignPatterns.AbstractFactory.Example1.products.Monitor;

public class AsusManufacturer implements Company {

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

}
