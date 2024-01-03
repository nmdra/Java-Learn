package DesignPatterns.Builder.Example3.director;

import DesignPatterns.Builder.Example3.builders.Builder;
import DesignPatterns.Builder.Example3.cars.CarType;
import DesignPatterns.Builder.Example3.components.Engine;
import DesignPatterns.Builder.Example3.components.GPSNavigator;
import DesignPatterns.Builder.Example3.components.Transmission;
import DesignPatterns.Builder.Example3.components.TripComputer;

/**
 * EN: Director defines the order of building steps. It works with a builder
 * object through common Builder interface. Therefore, it may not know what
 * product is being built.
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
