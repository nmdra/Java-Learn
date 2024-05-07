package OnlineTest.OnlineTest2.VersionA.Example1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    
    int[] userNumber = new int[5];
    int[] lotteryNumber = new int[5];
    ArrayList<Integer> al = new ArrayList<Integer>();
    
    Random rd = new Random();
    
    public Lottery() {
        
        for(int i = 0; i < 5; i++) {
            lotteryNumber[i] = rd.nextInt(9);
        }
        
    }
    
    public void UserNumber() {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++) {
            
            int y = i + 1;
            System.out.println("Enter " + y + " number: ");
            userNumber[i] = sc.nextInt();
        }
    }
    
    public void Match() {
        
        int j = 0;
        
        for(int i = 0; i < 5; i++) {

            if(lotteryNumber[i] == userNumber[i]) {
                j++;
                al.add(lotteryNumber[i]);
            }
        }
        
        System.out.println("User's Numbers");
        
        for(int i = 0; i < 5; i++) {
            System.out.println(userNumber[i] + "\t");
            
        }
        
        System.out.println("Lottery Numbers");
        
        for(int i = 0; i < 5; i++) {
            System.out.println(lotteryNumber[i] + "\t");
        }
        
        System.out.println("Number of matching digits: " + j);
        
        System.out.println("Matching Digits: ");
        
        for(Integer x: al) {
            
            System.out.println(x);
            
        }
    }
    
}

