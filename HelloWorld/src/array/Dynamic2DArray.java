package array;

public class Dynamic2DArray {

	public static void main(String[] args) {
		int[][]Darr2d= new int[4][6];
		
		for(int i=0;i<Darr2d.length;i++)
		{
			for(int j=0;j<Darr2d.length;j++)
			{
				Darr2d[i][j]=23+i*13+j*21;
				
		System.out.println("Darr2d["+i+"]["+j+"]="+Darr2d[i][j]);
			}
		}

	}

}
