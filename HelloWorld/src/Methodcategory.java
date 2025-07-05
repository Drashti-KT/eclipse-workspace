/*
public class Methodcategory 
{
void show1()   // No return type, no parameter
{
	System.out.println("No return type");

}
    public static void main(String args[])
    {
    	Methodcategory mt = new Methodcategory();
    	mt.show1();
    	mt.show2("Amit Score", 78.56f);
        mt.show3();
        mt.show4(0, false);
         	
	}
// no return type but parameter

void show2(String s, float k)
{
	System.out.println(s+" "+k+"%");
}

//return type but no parameter

int show3()
{
	System.out.println("Return type but no parameter" +"%");
	return 9;
	
}

//return type and parameter

String show4(int i,boolean b)
{
	String val = show4('A',true);
	System.out.println("val "+val);
	return val;
}

}*/
public class Methodcategory {

    // No return type, no parameter
    void show1() {
        System.out.println("No return type");
    }

    public static void main(String args[]) {
    	Methodcategory mt = new Methodcategory();
        mt.show1(); // Call show1
        mt.show2("Amit Score", 78.56f); // Call show2
        int score = mt.show3(); // Call show3 and store the return value
        System.out.println("Score returned from show3: " + score); // Print the score
        String result = mt.show4(0, false); // Call show4 and store the return value
        System.out.println("Result from show4: " + result); // Print the result
    }

    // No return type but parameter
    void show2(String s, float k) {
        System.out.println(s + " " + k + "%");
    }

    // Return type but no parameter
    int show3() {
        System.out.println("Return type but no parameter" + "%");
        return 9; // Return an integer value
    }

    // Return type and parameter
    String show4(int i, boolean b) {
        // Instead of calling show4 recursively, we can return a meaningful string
        String val = "Character: " + (char) ('A' + i) + ", Boolean: " + b; // Example of using parameters
        System.out.println("val: " + val);
        return val; // Return the constructed string
    }
}