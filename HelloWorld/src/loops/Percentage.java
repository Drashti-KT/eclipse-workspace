package loops;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		
		System.out.println("Enter the value of c:");
		int c = sc.nextInt();
		
		int totalmarks = a + b + c;
		System.out.println("Total marks in three subject is:" +totalmarks);
		
		double percentage = (totalmarks*100)/300;
		
		System.out.println("Total percentage is:" +percentage);
		
		sc.close();

	}

}
