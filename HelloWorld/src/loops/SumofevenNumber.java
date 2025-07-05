package loops;

public class SumofevenNumber {

	static int odd=0;
	static int even=0;
	public static void main(String[] args) 
	{
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				even=even+i;
			}
			else
				odd=odd+i;
		}
			System.out.println("The sum of all even Number is=" +even);
			System.out.println("The sum of all odd Number is=" +odd);
		}

	}


