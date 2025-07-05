package oopsconcept;
/*

		import java.io.BufferedWriter;
		import java.io.FileWriter;
		import java.io.IOException;

		public class FileOutput {
		    public static void main(String[] args) {
		        String content = "Hello, World!\nThis is a file output example.";
		        
		        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
		            writer.write(content);
		            System.out.println("Data written to file successfully.");
		        } catch (IOException e) {
		            System.out.println("An error occurred while writing to the file: " + e.getMessage());
		        }
		    }
		
	}


public class FileOutput{
	 

	  public static void main(String[] args) { 

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5 - i; j++) {

                System.out.print(" ");

            }

            for (int k = 0; k <= i; k++) {

                System.out.print(k + " ");

         }

            System.out.println();

        }
	  }

*/
	
public class FileOutput
{

public static void main(String[] args) {

    int n1 = 366, n2 = 60;

    int hcf = hcf(n1, n2);

    System.out.println("G.C.D of %d and %d is %d."+ n1, n2, hcf);

}
public static int hcf(int n1, int n2)
{

    if (n2 != 0)

        return hcf(n2, n1 % n2);

    else

        return n1;

}
}



