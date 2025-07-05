package loops;

public class PrimeNumber {

	public static void main(String[] args) {
		int add=0;
		int n=20;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+"is not prime number");
				add=1;
				break;
			}	
		}
		if(add!=1)
		{
			System.out.println(n+"is prime number");
		}

	}

}
