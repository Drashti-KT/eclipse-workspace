
public class SumEx 
	{
		int a=10,b=20,c;
		static void printsum()
		{
			SumEx sm=new SumEx();
			sm.c=sm.a+sm.b;
			System.out.println("Sum of a and b is "+sm.c);
		}
		public static void main(String args[])
		{
			printsum();
		}
	}

