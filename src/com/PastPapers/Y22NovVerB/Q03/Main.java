package PastPapers.Y22NovVerB.Q03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Object lock = new Object();
		String pattern1, pattern2;
		int count;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Pattern 1 = ");
		pattern1 = sc.nextLine();
		
		System.out.print("Enter Pattern 2 = ");
		pattern2= sc.nextLine();
				
		System.out.print("Enter count = ");
		count = sc.nextInt();

		System.out.println();

		Thread th2 = new Thread(new Pattern02(lock, pattern2, count));
		th2.start();
		Thread th = new Thread(new Pattern01(lock, pattern1, count));
		th.start();
	}
}
