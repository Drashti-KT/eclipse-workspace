package loops;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		int x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number x :-");
		x= sc.nextInt();
		
		if(x%2 == 0)
		{
			System.out.println("The Number is even Number");
		}
		else
		{
			System.out.println("The Number is odd Number");
		}
		sc.close();
	}

}
