
public class staticEx
	{
		int a=10;
		static int b=20;
		void display()
		{
			System.out.println("Value of a= "+a+ "value of b= "+b);
			staticEx s=new staticEx();
			s.a=15;
			staticEx.b=25;
			System.out.println("value of a= "+a+ "value of b= "+b);
			System.out.println("value of s.a= "+s.a+ "value of s.b= "+staticEx.b);
			
		}
		public static void main(String args[])
		{
			staticEx s1=new staticEx();
			s1.display();
		}
		
	}

