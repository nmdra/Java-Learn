package DesignPatterns.AbstractFactory.Example1;

import DesignPatterns.AbstractFactory.Example1.products.Product;
import DesignPatterns.AbstractFactory.Example1.factories.AsusManufacturer;
import DesignPatterns.AbstractFactory.Example1.factories.Company;
import DesignPatterns.AbstractFactory.Example1.factories.MsiManufacturer;

import java.util.List;

/**
 * Video Reference: <a href="https://youtu.be/QNpwWkdFvgQ">...</a>
 */
public class MainApp {


    public static void main(String[] args) {

        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();
//        Company asus2 = new AsusManufacturer();

        for (Product product : List.of(msi.createGpu(), msi.createMonitor(), asus.createGpu(), asus.createMonitor())) {
            product.assemble();
        }
    }
}
