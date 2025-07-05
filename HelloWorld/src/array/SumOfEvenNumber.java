package array;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		 int[] numbers = {3,8,9,7,6,4,2,1,5};
			int sum =0;
			System.out.println("The even numbers in the array are: ");
			
			for(int number : numbers)
			{
				if(number %2 == 0)
				{
					System.out.println(number);
					sum+=number;
				}
			}
					
			 System.out.println("The sum of the array: "+sum);
	
	}

}
