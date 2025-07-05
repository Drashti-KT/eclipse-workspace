package loops;

public class Puzzle3 {

	public static void main(String[] args) {
		/* The total number of students in a class are 90 out of which 45 are
           boys. If 50% of the total students secured grade 'A' out of which
           20 are boys, then write a program to calculate the total number of
           girls getting grade 'A'. */

		int totalStudents =90;
		//int boys = 45;
		//int girls = totalStudents - boys;
		
		int studentsWithGradeA = totalStudents / 2; 
				
		System.out.println("50% of the total students get grade A: "+studentsWithGradeA);
		
		int boyswithAgrade =20;
		
		int girlsWithGradeA = studentsWithGradeA - boyswithAgrade;
		
		System.out.println("Numbers of girls getting grade A is:"+ girlsWithGradeA);
	}

}
