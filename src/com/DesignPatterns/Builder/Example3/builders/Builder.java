package DesignPatterns.Builder.Example3.builders;

import DesignPatterns.Builder.Example3.cars.CarType;
import DesignPatterns.Builder.Example3.components.Engine;
import DesignPatterns.Builder.Example3.components.GPSNavigator;
import DesignPatterns.Builder.Example3.components.Transmission;
import DesignPatterns.Builder.Example3.components.TripComputer;

/**
 * EN: Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
