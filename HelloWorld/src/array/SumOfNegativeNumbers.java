package array;

public class SumOfNegativeNumbers {

	public static void main(String[] args) {
		int[]numbers = {5,-5,7,-7,8,-8,-12,-20,6,9,10};
		
		int sum=0;
		System.out.println("The negativenumbers are: ");
		
		for(int number : numbers)
		{
			if(number<0)
			{
				System.out.println(number);
				sum+=number;
			}

	}
		System.out.println("The sum of the Negative numbers: " +sum);
	}
}
