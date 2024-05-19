package PastPapers.Y23NovVerF.Q02;

public class VehicleSelectionDemo {

    private static final String CAR = "Car";
    private static final String BUS = "Bus";

    public static void main(String[] args) {

        ((ICar) VehicleProducer.getVehicle(CAR).getModel("RollsRoys")).displayVehicle();
        ((ICar) VehicleProducer.getVehicle(CAR).getModel("Benz")).displayVehicle();
        ((ICar) VehicleProducer.getVehicle(CAR).getModel("BMW")).displayVehicle();
        ((IBus) VehicleProducer.getVehicle(BUS).getModel("Volvo")).displayVehicle();
        ((IBus) VehicleProducer.getVehicle(BUS).getModel("Fuso")).displayVehicle();
        ((IBus) VehicleProducer.getVehicle(BUS).getModel("TATA")).displayVehicle();
    }
}
