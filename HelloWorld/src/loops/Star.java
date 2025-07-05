package loops;

public class Star {

			public static void main(String[] args) {
				 int i, j, k, l;
			        for(i = 1; i <= 5; i++) {
			            // Print leading spaces
			            for(j = 6; j >= i; j--) {
			                System.out.print(" ");
			            }
			            // Print the left side of the pyramid
			            for(k = i; k >= 1; k--) {
			                System.out.print(i);
			            }
			            // Print the right side of the pyramid
			            for(l = 2; l <= i; l++) {
			                System.out.print(i);
			            }
			            System.out.println(); // Move to the next line
			        }
	       	    }
	}

	
