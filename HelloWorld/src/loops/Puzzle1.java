package loops;

public class Puzzle1 {

	public static void main(String[] args) {
		/* Write a program to add 8 to the number 2345 and then divide it
		by 3. Now, the modulus of the quotient is taken with 5 and then
		multiply the resultant value by 5. Display the final result.*/

		/* int x= (((2345 + 8)/3)%5 )*5;
		
		System.out.println(x);*/
		
		
		int number = 2345;
		int addednumber = number + 8;
		
		int divided = addednumber/3;
		
		int modulus = divided %5;
		
		int finalresult = modulus *5;
		
		System.out.println("The final result:" +finalresult);
		
	}

}
