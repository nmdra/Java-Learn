package basic.IO;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class BufRead {
    public static void main(String[] args) throws IOException{

        System.out.println("Current Working Directory: " + System.getProperty("user.dir"));

        // Creates an array of characters
        char[] array = new char[100];

        // Creates a FileReader
        FileReader file = new FileReader("src/com/basic/IO/Monster.txt");

        // Creates a BufferedReader
        BufferedReader input = new BufferedReader(file);

        // Reads characters and returns the number of characters read
        int charsRead = input.read(array, 0, array.length);

        if (charsRead != -1) {
            System.out.println("Data in the file: ");
            // Prints only the portion of the array that contains valid characters
            System.out.println(new String(array, 0, charsRead));
        } else {
            System.out.println("No data read from the file.");
        }
    }
}
