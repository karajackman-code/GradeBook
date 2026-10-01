package gradebook;

import java.util.Scanner;

public class GradeBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Grade Book!");
		System.out.println("Please enter grades (1-100) and type -1 to stop");
		double grade = in.nextDouble();
		double gradetotal = 0;
		int gradenum = 0;
		double highest = -1;
		double lowest = 101;
		while (grade > -1) {
			if (grade > 100) {
				System.out.println("Invalid. Try again");
			} else {
				if (grade > highest) {
					highest = grade;
					gradetotal = gradetotal + grade;
				} else if (grade < lowest) {
					lowest = grade;
					gradetotal = gradetotal + grade;
				} else {
					gradetotal = gradetotal + grade;
				}
				gradenum = gradenum + 1;
				System.out.println("Enter Grade:");
			}
			grade = in.nextDouble();
		}
		System.out.println("All done!");
		System.out.println("Total grades entered: " + gradenum);
		System.out.println("Highest grade: " + highest);
		System.out.println("Lowest grade: " + lowest);
		double gradeavg = gradetotal / gradenum;
		gradeavg *= 100;
		gradeavg = Math.round(gradeavg);
		gradeavg /= 100;
		System.out.println("Class average: " + gradeavg);
		if (gradeavg>80) {
			System.out.println("Congratulations! You made honour roll!");
		}
		in.close();
	}

}
