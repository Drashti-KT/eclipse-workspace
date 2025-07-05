
public class twodex 
{
	public static void main (String[] args) 
	{

/*	
		int a[][]= {
		{23,48,72},
		{12,16,19}
           };
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		System.out.print(" "+a[i][j]);
			}
	System.out.println(" ");
}
	
	}
*/

	
	//dynamic
int b[][]=new int [2][3];
for(int i=0;i<b.length;i++)
{
	for(int j=0;j<b[i].length;j++)
	{
		b[i][j]=1*i+2*j+2;
		System.out.print(" "+b[i][j]);
		
	}
	System.out.println(" ");
	
		
	}
}
}
