
public class NestedIfelse {

	public static void main(String[] args) {
		int i=20;
		if(i==10 || i<15)
		{
			if(i<15)
				System.out.println("i is smaller than 15");
			if(i<12)
				System.out.println("i is smaller than 12 too");
		}
		else
		
			System.out.println("i is greater than 15");
		
	}

}
