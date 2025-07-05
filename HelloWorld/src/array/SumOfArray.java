package array;

public class SumOfArray {
	
	public static void main(String[] args) {
         int[] numbers = {23,56,89,96,46,57};
		
		double sum = 0;
		for(int number : numbers)
		{
			sum+= number;
		}
		
			System.out.println("The sum of the array: " + sum);

	}

}
