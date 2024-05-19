package PastPapers.Y23NovVerF.Q02;

public class Fuso implements IBus {
    private static Fuso instance;

    private Fuso(){}

    public static Fuso getInstance(){
        if(instance==null){
            instance=new Fuso();
        }
        return instance;
    }

    @Override
    public void displayVehicle() {
        System.out.println("Factory Turns out Fuso Bus.");
    }
}
