package basic.Static;

public class StaticClass {
    private static String s= "Javatpoint";

    //Static and nested class
    static class StaticNestedClass {
        //non-static method of the nested class
        public void show()
        {
        //prints the string defined in base class
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass obj = new StaticNestedClass();

        //invoking the method of the nested class
        obj.show();
    }
}