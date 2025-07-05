package array;

public class TwoDimensionArray {

	public static void main(String[] args) {
	int[][]arr2d= {{5,4,9},{4,6,5}, {8,7,2}};
	for(int i=0;i<arr2d.length;i++)
	{
		for(int j=0;j<arr2d.length;j++)
		{
	System.out.println("arr2d["+i+"]["+j+"]="+arr2d[i][j]);
		}
	}

	}

}
