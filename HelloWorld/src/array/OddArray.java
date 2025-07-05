package array;

public class OddArray {

	public static void main(String[] args) {
		
		int[] numbers = {3,8,9,7,6,4,2,1,5};
		
		System.out.println("The odd numbers in the array are: ");
		
		for(int number : numbers)
		{
			if(number %2 != 0)
			{
				System.out.println(number);
			}
			
		}
		

	}

}
