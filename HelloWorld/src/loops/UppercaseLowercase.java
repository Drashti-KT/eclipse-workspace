package loops;

import java.util.Scanner;

public class UppercaseLowercase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter the character: - ");
				
				String input = sc.next();
				if(input.length() == 1)
				{
					char ch= input.charAt(0);
				
			if(Character.isUpperCase(ch))
			{
				System.out.println("The character is Uppercase");
			}	
				else if(Character.isLowerCase(ch))
			{
				System.out.println("The character is Lowercase");
			}
				else
				{
					System.out.println("The character is not alphabet");
				}
				}else
			{
				System.out.println("please enter only one alphabet");
			}	
				
				sc.close();
	
	}

}
