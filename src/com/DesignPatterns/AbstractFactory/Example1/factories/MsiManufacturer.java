package DesignPatterns.AbstractFactory.Example1.factories;

import DesignPatterns.AbstractFactory.Example1.products.Gpu;
import DesignPatterns.AbstractFactory.Example1.products.Monitor;
import DesignPatterns.AbstractFactory.Example1.products.MsiGpu;
import DesignPatterns.AbstractFactory.Example1.products.MsiMonitor;

public class MsiManufacturer implements Company {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}