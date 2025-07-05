package array;

public class AverageOfArray {

	public static void main(String[] args) {
		int[] numbers = {23,56,89,96,46,57};
		
		double sum = 0;
		for(int number : numbers)
		{
			sum+=number;
		}
		
		double average = sum / numbers.length;
		
		System.out.println("The average of the values of array is:" +average);

	}

}
