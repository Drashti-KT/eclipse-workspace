package loops;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Character ch=");
		String input = sc.next();
		
		if(input.length() == 1)
		{
		char ch = input.charAt(0);
				ch= Character.toLowerCase(ch);
				
		if((ch>='a') && (ch<='z'))
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println("The alphabet is Vowel");
			}
			else
			{
				System.out.println("The alphabet is Consonant");
			}
		}else
		{
			System.out.println("Invalid input, Please enter Alphabet");
		}
		}else
		{
			System.out.println("Please enter only single Alphabet");
		}

		
		sc.close();
	}
}
