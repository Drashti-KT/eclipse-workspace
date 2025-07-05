package array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][]Marr2d= new int[4][];
		Marr2d[0]= new int[5];
		Marr2d[1]= new int[1];
		Marr2d[2]= new int[3];
		Marr2d[3]= new int[4];
		
		for(int i=0; i<Marr2d.length; i++)
		{
			for(int j=0; j<Marr2d[i].length; j++)     //here we have used Marr2d[i] to ensure that it iterates over the correct number of columns for each row.
			{
				Marr2d[i][j]=23+i*13+j*12;
				System.out.println("Marr2d["+i+"]["+j+"]="+Marr2d[i][j]);
				System.out.println(""+Marr2d[i][j]);
				System.out.println("");
				System.out.println("----------");
			}
			
		}
	}

}
