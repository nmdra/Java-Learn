package DataStructures.Stack.Quiz.Q1;

import DataStructures.Stack.GenericStack;
import DataStructures.Stack.StackException;

import java.util.Scanner;

public class PalindromeStack {
    public static void main(String[] args) throws StackException {
        System.out.println("Enter Word :");

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().toLowerCase();

        GenericStack<Character> str = new GenericStack<>(word.length());

        for(char ch : word.toCharArray()) {
            str.push(ch);
        }

        String reverseStr = "";

        while(!str.isEmpty()) {
            reverseStr = reverseStr + str.pop();
        }

        if(reverseStr.equals(word)) {
            System.out.println("Palindrome Word");
        } else {
            System.out.println("Not Palindrome Word");
        }
    }
}
