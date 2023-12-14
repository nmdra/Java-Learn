package LabEx.Lab2;

public class Lab2Ex2 {
    public static void main(String[] args) {

        if(args.length == 0) System.out.println("No Command Line Arguments found.");

        try {

            System.out.println("DitNo : " + args[1]);
            System.out.println("Name : " + args[0]);
            System.out.println("District : " + args[2]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}