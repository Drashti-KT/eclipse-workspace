package oopsconcept;

public class Inheritance {

	class Employee{
		float salary = 40000;
	}
	
	class Programmer extends Employee{
		int bonus=10000;
	}
		
	public static void main(String[] args) 
	{
		Inheritance inheritance = new Inheritance(); // Create an instance of Inheritance
        Programmer p = inheritance.new Programmer(); 
		System.out.println("programmer salary is :" +p.salary);
		System.out.println("Bonus of programmer is:" +p.bonus);
	}
	}


