package Tutorial;

import java.util.Scanner;

public class Tute1ex6 {
    public static void main(String[] args) {

        Scanner getStr = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = getStr.next();

        System.out.print("Enter String: ");
        char character = getStr.next().charAt(0);

        System.out.println("Character \"" + character +
                "\" Occurrence(using loop): " + countChar(str, character));
        System.out.println("Character \"" + character +
                "\" Occurrence(recursion): " + countCharRec(str, character, 0));
    }

    // Count character Occurrence using Loop
    static int countChar (String string, char a) {
        int count = 0;
        for(int i = 0; i < string.length(); i++) {
            count += (string.charAt(i) == a) ? 1 : 0;
        }

        return count;
    }

    // Count Character Occurrence using recursion
    static int countCharRec (String string, char a, int index) {

        if (index >= string.length()){
            return 0;
        }

        int count = string.charAt(index) == a ? 1 : 0;

        return count + (countCharRec(string, a, index + 1));

    }
}
