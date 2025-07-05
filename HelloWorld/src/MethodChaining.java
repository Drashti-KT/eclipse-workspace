
public class MethodChaining 
{

	public static void main(String[] args) 
	{
		
    MethodChaining mth = new MethodChaining();
    
    mth.A();
	}
    
	void A()
	{
    System.out.println("In A before calling B");
    B();
    System.out.println("In A after calling B");
    }

	void B()
	{
	 System.out.println("In B before calling C");
	 C();
     System.out.println("In B after calling C");
    }
	
	void C()
	{
    System.out.println("In C before calling D");
    D();
    System.out.println("In C after calling D");
	}
	
	void D()
	{
		System.out.println("In D");
	}
	
}
