package OOP.Polymophism.Shapes;

class Square extends Rectangle{
    private double side;

    Square(double side){
        super(side);
//        this.side = side;
    }

    @Override
    public void calculateArea(){
        System.out.println("Square Area = " + super.length * super.width);
    }

}
