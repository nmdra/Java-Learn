package Tutorial;

// import java.util.Scanner;

// public class Tute1ex4 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Get a string from the user
//         System.out.print("Enter a string: ");
//         String inputString = scanner.nextLine();

//         // Display the reverse of the string
//         String reversedString = reverseString(inputString);
//         System.out.println("Reversed String: " + reversedString);

//         scanner.close();
//     }

//     // Method to reverse a string using a loop
//     private static String reverseString(String input) {
//         StringBuilder reversed = new StringBuilder();

//         // Iterate through the characters in reverse order
//         for (int i = input.length() - 1; i >= 0; i--) {
//             reversed.append(input.charAt(i));
//         }

//         return reversed.toString();
//     }
// }


import java.util.Scanner;

public class Tute1ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get a string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Display the reverse of the string
        String reversedString = reverseString(inputString);
        System.out.println("Reversed String: " + reversedString);

        scanner.close();
    }

    // Method to reverse a string without using inbuilt classes
    private static String reverseString(String input) {
        char[] charArray = input.toCharArray();

        // Iterate through the characters in reverse order and swap
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move indices towards each other
            start++;
            end--;
        }

        return new String(charArray);
    }
}
