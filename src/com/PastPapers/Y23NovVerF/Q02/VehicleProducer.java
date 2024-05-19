package PastPapers.Y23NovVerF.Q02;

public class VehicleProducer {
    public static VehicleFactory getVehicle(String vehicle){
       if(vehicle.equalsIgnoreCase("Car")){
           return CarFactory.getInstance();
       } else if(vehicle.equalsIgnoreCase("Bus")){
           return BusFactory.getInstance();
       } else {
           return null;
       }
    }
}
