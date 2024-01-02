package codsoftinter;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks obtained in each subject (out of 100):");
        int totalSubjects;
        do {
            System.out.print("Number of subjects: ");
            totalSubjects = scanner.nextInt();
        } while (totalSubjects <= 0);

        int totalMarks = 0;

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int subjectMarks = scanner.nextInt();
            totalMarks += subjectMarks;
        }

        double averagePercentage = (double) totalMarks / totalSubjects;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
