// Abstract Factory

package DesignPatterns.AbstractFactory.Example1.factories;

import DesignPatterns.AbstractFactory.Example1.products.Gpu;
import DesignPatterns.AbstractFactory.Example1.products.Monitor;

public interface Company {

     Gpu createGpu();

     Monitor createMonitor();
}
