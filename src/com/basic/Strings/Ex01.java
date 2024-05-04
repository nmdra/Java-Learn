package basic.Strings;

public class Ex01 {
    public static void main(String[] args) {
        int age = 24;
        String s1 = "he is " +  age + " Years old.";
        String s2 = "Value of X = " + 2 + 2;
        StringBuffer s3 = new StringBuffer("Water is Enough.");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3.reverse());
    }
}
