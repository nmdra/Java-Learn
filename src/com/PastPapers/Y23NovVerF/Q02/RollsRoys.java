package PastPapers.Y23NovVerF.Q02;

public class RollsRoys implements ICar {

    private static RollsRoys instance;

    private RollsRoys() {}

    public static RollsRoys getInstance(){
        if(instance==null){
            instance=new RollsRoys();
        }
        return instance;
    }

    @Override
    public void displayVehicle() {
        System.out.println("Factory Turns Out RollsRoys");
    }
}
