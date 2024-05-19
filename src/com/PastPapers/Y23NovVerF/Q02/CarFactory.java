package PastPapers.Y23NovVerF.Q02;

public class CarFactory implements VehicleFactory{

    private static volatile CarFactory instance;

    private CarFactory(){};

    public static CarFactory getInstance(){
        if(instance==null){
            synchronized (CarFactory.class){
                if(instance==null){
                    instance=new CarFactory();
                }
            }
        }
        return instance;
    }


    @Override
    public ICar getModel(String model) {
        switch (model){
            case "BMW":
                return BMW.getInstance();
            case "Benz":
                return Benz.getInstance();
            case "RollsRoys":
                return RollsRoys.getInstance();
            default:
                return null;
        }
    }
}
