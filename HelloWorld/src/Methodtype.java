
public class Methodtype {

	int a=22;
	static int b=30;
	
	void show()
	{
		System.out.println("In show non static method");
	}
	static void display()
	{
		System.out.println("In display static method");
	}
	
	void test()
	{
		display();
		show();
	}
	
	public static void main(String[] args) {
	
    Methodtype mt= new Methodtype();
    display();
    System.out.println("Static variable b=" + b);
	mt.show();
	System.out.println("Non Static variable a=" + mt.a);
	}

}
