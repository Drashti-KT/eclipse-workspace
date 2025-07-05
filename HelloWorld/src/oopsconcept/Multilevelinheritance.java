package oopsconcept;

public class Multilevelinheritance {

	static class GrandParent
	{
		void show1()
		{
			System.out.println("In Grand parent");
		}
	}
	
	static class parent extends GrandParent
	{
		void show2()
		{
			System.out.println("In parent");
		}
	}
	
	static class Child extends parent
	{
		void show3()
		{
			System.out.println("In Child");
		}
	}
	
	static class GrandChild extends Child
	{
		void show4()
		{
			System.out.println("In GrandChild");
		}
	}
	
		public static void main(String[] args) {
			GrandChild gc = new GrandChild();
			gc.show1();
			gc.show2();
			gc.show3();
			gc.show4();

		}	
	}



