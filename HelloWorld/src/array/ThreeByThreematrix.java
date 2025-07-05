package array;

import java.util.Scanner;

public class ThreeByThreematrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int[][]matrix = new int [3][3];
	
	System.out.println("Enter the element of 3*3 matrix:");
	for(int i=0; i<3 ; i++)
	{
		for(int j=0; j<3 ; j++)
		{
			matrix[i][j] = sc.nextInt();
		}
	}
	
	int [] rowSums = new int[3];
	int [] columnSums = new int[3];
	int diagonalSum1 =0;
	int diagonalSum2 =0;
	
	for(int i=0; i<3 ; i++)
	{
		for(int j=0; j<3 ; j++)
		{
			rowSums[i] += matrix[i][j];
			columnSums[j] += matrix[i][j];
			
			if(i == j)
			{
				diagonalSum1 += matrix[i][j];
			}
			if(i+j==2)
			{
				diagonalSum2 += matrix[i][j];
			}
		}
	}
	
	System.out.println("Sum of rows: ");
	for(int i=0; i<3 ; i++)
	{
		System.out.println("Row" + (i+1) +": "+ rowSums[i]);
	}
		for(int j=0; j<3 ; j++)
		{
		System.out.println("column" + (j+1) +": "+ columnSums[j]);
		}
		System.out.println("Sum of main diagonal:" +diagonalSum1);
		System.out.println("Sum of second diagonal:" +diagonalSum2);
		sc.close();

	}
}

