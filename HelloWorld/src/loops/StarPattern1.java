package loops;

class StarPattern1
{
    public static void main(String[] args) {
        // First block of stars (10 stars in each row)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++)
            {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Second block of stars (7 stars in the row)
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 7; j++) 
            {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after the row
        }

        // Third block of stars (3 stars in the row)
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++)
            {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after the row
        }
    }
}