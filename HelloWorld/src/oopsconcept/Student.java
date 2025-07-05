package oopsconcept;

public class Student 
{

	private int rollno;
	private String name;
	
	void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	
	int getRollno()
	{
		return this.rollno;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	String getname()
	{
		return this.name;
	}

	class EncapsulationEx
	{
		public static void main(String[] args) {
			Student s1=new Student();
			Student s2=new Student();
			Student s3=new Student();
			
			s1.setRollno(101);
			s2.setRollno(102);
			s3.setRollno(103);
			
			s1.setName("Atul");
			s2.setName("Ankit");
			s1.setName("Amit");
			
			System.out.println("Student 1: ");
			System.out.println("Rollno: "+s1.getRollno());
			System.out.println("Name: "+s1.getname());
			
			System.out.println("Student 2: ");
			System.out.println("Rollno : "+s2.getRollno());
			System.out.println("Name: "+s2.getname());
			
			System.out.println("Student 3: ");
			System.out.println("Rollno : "+s3.getRollno());
			System.out.println("Name: "+s3.getname());
			
	}
	}
}
