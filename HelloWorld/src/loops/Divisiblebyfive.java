package loops;

import java.util.Scanner;

public class Divisiblebyfive {

	public static void main(String[] args) {
		int x=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number x -");
		x=sc.nextInt();
		if((x%5 == 0) && (x%11 == 0))
		{
			System.out.println("The number is divisible by 5 and 11");
		}
		else if(x%5 == 0)
		{
			System.out.println("The number is divisible by 5");
		}
		else if(x%11 == 0)
		{
			System.out.println("The number is divisible by 11");
		}
		else
		{
			System.out.println("The number is not divisible by 5 or 11");
		}
		sc.close();
	}

}
