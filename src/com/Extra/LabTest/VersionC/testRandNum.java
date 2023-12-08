package Extra.LabTest.VersionC;

public class testRandNum {
    public static void main(String[] args) {
        RandNum rd = new RandNum();

        rd.displayMatrix();
        System.out.println("Minimum: " + rd.minimum());
        System.out.println("Maximum: " + rd.maximum());
        System.out.println("Average: " + rd.avg());
    }

}
