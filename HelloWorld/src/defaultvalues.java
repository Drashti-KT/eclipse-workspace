
public class defaultvalues // class name
	{
		byte b;
		int i;
		long l;
		float f;
		short s;
		double d;
		char c;
		
		// main method
		public static void main(String[] args)
			{
				// Created object of class(default values) to call non-static method
				defaultvalues obj = new defaultvalues();
				
				// Calling non-static method
				obj.nonstaticmethod();
			}
			
			// non-static method
			void nonstaticmethod()
			{
				System.out.println("This is a default value of byte: "+b);
				System.out.println("This is a default value of int: "+i);
				System.out.println("This is a default value of long: "+l);
				System.out.println("This is a default value of float: "+f);
				System.out.println("This is a default value of short: "+s);
				System.out.println("This is a default value of double: "+d);
				System.out.println("This is a default value of char: "+c);
			}
	}

