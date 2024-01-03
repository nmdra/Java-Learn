package DesignPatterns.Builder.Example3;

import DesignPatterns.Builder.Example3.builders.CarBuilder;
import DesignPatterns.Builder.Example3.builders.CarManualBuilder;
import DesignPatterns.Builder.Example3.cars.Car;
import DesignPatterns.Builder.Example3.cars.Manual;
import DesignPatterns.Builder.Example3.director.Director;

/**
 * EN: Demo class. Everything comes together here.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // EN: Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // EN: The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.

        Car car = builder.getResult();
        System.out.println(car.getEngine().getVolume());
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // EN: Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
  }

}
