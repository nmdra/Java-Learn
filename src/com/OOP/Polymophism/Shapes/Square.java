package OOP.Polymophism.Shapes;

class Square extends Rectangle{
    private double side;

    Square(double side){
        super(side);
    }

    @Override
    public void calculateArea(){
        System.out.println("Square Area = " + side * side);
    }

}
