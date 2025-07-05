package loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0, b=1,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number-");
		a=sc.nextInt();
		System.out.println(a+""+b);
		
		for(int i=10; i>=1; i--)
		{	
			if(i>=1)
			{
				c=a+b;
				System.out.println(""+c);
				a=b;
				b=c;
				
			}
		sc.close();
		}

	}

}
