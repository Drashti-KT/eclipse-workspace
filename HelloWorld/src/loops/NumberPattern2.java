package loops;

public class NumberPattern2 {

	public static void main(String[] args) {
	   int i,j,k,l = 0;
	   int row = 5;
	   
	   for(i=0; i<=row; i++)
	   {
		  for(j=row;j>i; j--)
		  {
			  System.out.print("  ");
		  }
		  for(k=i; k>=1; k--)
		  {
			  System.out.print(k +" ");
		  }
		  for(l=2; l<=i; l++)
		  {
			  System.out.print(l +" ");
		  }
		  System.out.println();
	   }

	}

}
