package loops;

import java.util.Scanner;

public class HCFoftwoNumber {

	public static void main(String[] args) {
		int a,b, HCF=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number-");
		a=sc.nextInt();
		System.out.println("Enter the Second Number-");
		b=sc.nextInt();
		
		for(int i=1; i<a && i<b; i++)
		{
			if(a%i==0 && b%i==0)
				HCF=i;
			{
				System.out.println("HCF of given two Number is ::"+HCF);
				
				sc.close();
			}
		}
	}

}
