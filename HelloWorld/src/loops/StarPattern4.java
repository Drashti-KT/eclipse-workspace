package loops;

public class StarPattern4 {

	public static void main(String[] args)
	{
		int row = 10;
		for(int i=0; i<row; i++)
		{
			if(i%2==0)
			{
			for(int j=row-i; j>1; j--)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
			System.out.print("* ");
			}
			System.out.println();	
}
		}
	}
}
	
	
	

	
