package loops;

import java.util.Scanner;

public class Puzzle2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		
		if((a<50) && (a<b))
		{
			System.out.println("Both the condition is true");
		}
		else
			System.out.println("At least one of the conditions is false");
		sc.close();
	}

}
