package loops;

import java.util.Scanner;

public class ProfitORLoss {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Cost Price CP = ");
		int costPrice = sc.nextInt();
		
		System.out.println("Enter Sale Price SP = ");
		int sellPrice = sc.nextInt();
		
		if(sellPrice>costPrice)
		{
			int profit = sellPrice - costPrice;
			System.out.println("It's Profit of: " +profit);
		}
		else if(sellPrice<costPrice)
		{
			int loss = costPrice - sellPrice;
			System.out.println("It's Loss of: " +loss);
		}
		else
		{
			System.out.println("There is no profit or loss");
		}
		sc.close();
	
	}

}
