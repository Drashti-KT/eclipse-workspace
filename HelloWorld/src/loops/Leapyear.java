package loops;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year = ");
		int year= sc.nextInt();
		
		if((year%400 == 0) || ((year%4 == 0) && (year%100 == 0)))
		{
			System.out.println("This Year is Leap Year");
		}
		else
		{
			System.out.println("This Year is not Leap Year");
	
		sc.close();
		}
				
		
			

	}
   
}
