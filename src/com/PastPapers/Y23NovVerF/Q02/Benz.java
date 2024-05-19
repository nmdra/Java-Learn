package PastPapers.Y23NovVerF.Q02;

public class Benz implements ICar {

    private static Benz instance;

    private Benz(){}

    public static Benz getInstance(){
        if(instance==null){
            instance=new Benz();
        }
            return instance;
    }

    @Override
    public void displayVehicle() {
        System.out.println("Factory Turns Out Benz Car");
    }
}
