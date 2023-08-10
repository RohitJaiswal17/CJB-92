package Practise.decisionmaking.switchcase;

import java.util.Scanner;

public class GradesProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score (0-100): ");
        int score = scanner.nextInt();

        char grade;

        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
            scanner.close();
            return;
        }

        int gradeValue = score / 10;

        switch (gradeValue) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        System.out.println("Corresponding letter grade: " + grade);

        scanner.close();
    }
}