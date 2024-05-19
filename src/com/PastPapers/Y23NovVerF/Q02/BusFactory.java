package PastPapers.Y23NovVerF.Q02;

public class BusFactory implements VehicleFactory{

    private static volatile BusFactory instance;

    private BusFactory(){};

    public static BusFactory getInstance(){
        if(instance==null){
            synchronized (BusFactory.class){
                if(instance==null){
                    instance=new BusFactory();
                }
            }
        }
        return instance;
    }


    @Override
    public IBus getModel(String model) {
        switch (model){
            case "Volvo":
                return Volvo.getInstance();
            case "TATA":
                return TATA.getInstance();
            case "Fuso":
                return Fuso.getInstance();
            default:
                return null;
        }

    }
}