
public class Variable {


	int a=89;
	static int b=78;
	
	public static void main(String[] args) 
	
{
    Variable v = new Variable();
    
	System.out.println("a=" +v.a);
	System.out.println("b=" +Variable.b);
	
	
	v.a=56;
	Variable.b=12;
	System.out.println("a="+v.a);
	System.out.println("b="+Variable.b);
	System.out.println("v.a="+v.a);
	System.out.println("v.b="+Variable.b);
	
	Variable v1=new Variable();
	v1.a=55;
	Variable.b=26;
	System.out.println("a="+v.a);
	System.out.println("b="+b);
	System.out.println("v.a="+v.a);
	System.out.println("v.b="+Variable.b);
	System.out.println("v1.a="+v1.a);
	System.out.println("v1.b="+Variable.b);
}
	}