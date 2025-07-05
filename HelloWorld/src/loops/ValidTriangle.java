package loops;

import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args)
	{
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value of side a:-");
		a=sc.nextDouble();
		
		System.out.println("Enter the Value of side b:-");
		b=sc.nextDouble();
		
		System.out.println("Enter the Value of side c:-");
		c=sc.nextDouble();
		
		if(isValidTriangle(a,b,c))
		{
			System.out.println("Triangle is Valid");
		}
		else
			System.out.println("Triangle is inValid");
		
		sc.close();
	}

	private static boolean isValidTriangle(double a, double b, double c) {
		// TODO Auto-generated method stub
		return (a+b>c) && (b+c>a) && (c+a>b);
	}
}
