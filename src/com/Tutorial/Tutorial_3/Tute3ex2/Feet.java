package Tutorial.Tutorial_3.Tute3ex2;

class Feet {
    private int feet;
    private int inches;

    public Feet(int feet, int inches){
        this.feet = feet;
        this.inches = inches;
    }

    public Feet(Feet len) {
        this.feet = len.feet;
        this.inches = len.inches;
    }

    // Add f1+f2 feet and store in current feet
    public void add(Feet f1, Feet f2){
        this.feet = f1.feet + f2.feet;
        this.inches = f1.inches + f2.inches;

        if (inches >= 12) {
            feet++;
            inches -= 12;
        }
    }

    public void add(Feet f1){
        this.feet += f1.feet;
        this.inches += f1.inches;

        if (inches >= 12) {
            feet++;
            inches -= 12;
        }
    }

//    public static Feet add(Feet f1, Feet f2){}

    // Ref: https://stackoverflow.com/a/26093759
    public static Feet add(Feet f1, Feet f2, Feet f3) {

        int nf = f1.feet + f2.feet + f3.feet;
        int ni = f1.inches + f2.inches + f3.inches;

        if (ni >= 12) {
            nf++;
            ni -= 12;
        }

        return new Feet(nf,ni);
    }

    // Display a Length e.g 5’6”
    public void print() {
        System.out.println(feet + "'" + inches + "\"");
    }

    public void print(String msg) {
        System.out.println("Length : " + feet + "'" + inches + "\"");
    }

    public static void print(Feet f) {
        System.out.println("Length : " + f.feet + "'" + f.inches + "\"");
    }
}
