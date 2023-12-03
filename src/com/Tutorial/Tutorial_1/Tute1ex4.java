package Tutorial.Tutorial_1;

import java.util.Scanner;

class Tute1ex4 {
    public static void main(String[] args) {
        Scanner getStr = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = getStr.next();

        // Printing the reversed string using the loop approach
        System.out.println("Reversed String: " + reverseStr(str));

        // Printing the reversed string using StringBuilder
        System.out.println("Reversed String(Using StringBuilder): " + reverseStrBld(str));
    }

    // Method to reverse a string using a loop
    static String reverseStr(String strng) {
        // Initializing an empty string to store the reversed string
        String reversedString = "";

        for (int i = strng.length() - 1; i >= 0; i--) {
            // Appending each character to the reversed string
            reversedString += strng.charAt(i);
        }

        // Returning the reversed string
        return reversedString;
    }

    // Method to reverse a string using StringBuilder
    static String reverseStrBld(String strng) {
        // Creating a StringBuilder object to efficiently build the reversed string
        StringBuilder reversedStringBuilder = new StringBuilder();

        // Iterating through the characters of the input string in reverse order
        for (int i = strng.length() - 1; i >= 0; i--) {
            reversedStringBuilder.append(strng.charAt(i));
        }

        // Converting the StringBuilder to a String and returning the result
        return reversedStringBuilder.toString();
    }
}
