import java.util.Scanner;

public class StudentsResult {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to Calculate Final Grades");
        System.out.println("========================");

        System.out.print("1. Enter assignment value: ");
        double assignment = sc.nextDouble();
        System.out.print("2. Enter quiz score: ");
        double quiz = sc.nextDouble();
        System.out.print("3. Enter MidTerm score: ");
        double midterm = sc.nextDouble();
        System.out.print("4. Enter FinalExam score: ");
        double finalExam = sc.nextDouble();

        System.out.println("======================");
        System.out.println("======================");
        calculateGrade(assignment, quiz, midterm, finalExam);
    }
    public static void calculateGrade(double assignment, double quiz, double midterm, double finalExam) {
        if (assignment < 0 || assignment > 100 || quiz < 0 || quiz > 100 || 
            midterm < 0 || midterm > 100 || finalExam < 0 || finalExam > 100) {
            System.out.println("Invalid Value.");
            return;
        }
        
        double finalGrade = (0.20 * assignment) + (0.20 * quiz) + (0.30 * midterm) + (0.30 * finalExam);
        String letterGrade;

        if (finalGrade >= 80) {
            letterGrade = "A";
        } else if (finalGrade >= 73) {
            letterGrade = "B+";
        } else if (finalGrade >= 65) {
            letterGrade = "B"; 
        } else if (finalGrade >= 60) {
            letterGrade = "C+";
        } else if (finalGrade >= 50) {
            letterGrade = "C";
        } else if (finalGrade >= 39) {
            letterGrade = "D";
        } else {
            letterGrade = "E";
        }

        System.out.println("Final Grade: " + finalGrade);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.println("======================");
        System.out.println("======================");

        if (finalGrade >= 50) {
            System.out.println("CONGRATULATIONS, YOU PASSED!");
        } else {
            System.out.println("SORRY, YOU FAILED.");
        }
    }
}