import java.util.Scanner;

class StudentGrading {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int subject = 1;
		int TotalSubjects = 5;
		int marks = 0;
		final int MARKS = 100;

		System.out.print("Enter your name: ");
		String name = input.nextLine();

		for (int i = TotalSubjects;i>0;i--) {
			System.out.print("Enter your marks for subject "+subject+": ");
			subject++;
			int inMarks = input.nextInt();
			marks += inMarks;
		}
		double percent = (marks/(double)(TotalSubjects*MARKS))*100;
		System.out.println(percent);
		String grade = " ";
		if(percent>=85) grade = "A+";
		else if (percent >=75) grade = "A";
		else if (percent >=64) grade = "B";
		else if (percent >=50) grade = "C";
		else if (percent < 50) grade = "FAIL";

		System.out.println(name+" grade is "+grade);

	}
}