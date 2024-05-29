package PastPapers.Y22JuneVerA.Q01;

public class Squirrel extends Pet {

    String command;

    public Squirrel(String command) {
        super();
        this.command = command;
    }

    @Override
    public void feed() {
        System.out.println("Feeding the Squirrel");
        setPoint(getPoint()+5);
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the Squirrel");
        setPoint(getPoint() + 10);
    }

    @Override
    public void cuddle() {
        System.out.println("Cuddle the Squirrel");
        setPoint(getPoint() + 15);
    }

    public boolean isCaught(){
        try {
            if (command.equals("Run5")) {
                throw new CaughtException("Caught");
            }
        } catch (CaughtException e) {
            System.out.println("Q1." + e.getClass().getSimpleName() + " : " + e.getMessage());
            return true;
        }
        System.out.println("Did not Caught");
        return false;
    }

    @Override
    public void GetTotalPoints() {
        if(isCaught()){
            setPoint(0);
        } else {
            System.out.println("Total Point is " + getPoint());
        }
    }
}
