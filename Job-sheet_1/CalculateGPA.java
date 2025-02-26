import java.util.Scanner;

public class CalculateGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] courses = {
            "Pancasila",
            "Information Technology Concepts",
            "Critical Thinking and Problem Solving",
            "Basic Mathematics",
            "English Language",
            "Programming Basics",
            "Programming Basics Lab",
            "Occupational Health and Safety"
        };
        double[] numericGrades = new double[8];
        String[] letterGrades = new String[8];
        double[] gradeWeights = new double[8];

        for (int i = 0; i < courses.length; i++) {
            System.out.print("Enter numeric grade for " + courses[i] + ": ");
            numericGrades[i] = input.nextDouble();

            if (numericGrades[i] >= 85) {
                letterGrades[i] = "A";
                gradeWeights[i] = 4.00;
            } else if (numericGrades[i] >= 80) {
                letterGrades[i] = "A-";
                gradeWeights[i] = 3.75;
            } else if (numericGrades[i] >= 75) {
                letterGrades[i] = "B+";
                gradeWeights[i] = 3.50;
            } else if (numericGrades[i] >= 70) {
                letterGrades[i] = "B";
                gradeWeights[i] = 3.00;
            } else if (numericGrades[i] >= 65) {
                letterGrades[i] = "B-";
                gradeWeights[i] = 2.75;
            } else if (numericGrades[i] >= 60) {
                letterGrades[i] = "C+";
                gradeWeights[i] = 2.50;
            } else if (numericGrades[i] >= 55) {
                letterGrades[i] = "C";
                gradeWeights[i] = 2.00;
            } else if (numericGrades[i] >= 50) {
                letterGrades[i] = "C-";
                gradeWeights[i] = 1.75;
            } else if (numericGrades[i] >= 40) {
                letterGrades[i] = "D";
                gradeWeights[i] = 1.50;
            } else {
                letterGrades[i] = "E";
                gradeWeights[i] = 1.00;
            }
        }
        double totalWeight = 0;
        for (double weight : gradeWeights) {
            totalWeight += weight;
        }
        double gpa = totalWeight / gradeWeights.length;

        System.out.println("\n====================================================================");
        System.out.println("                      Grade Conversion Results                      ");
        System.out.println("====================================================================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "Course", "Numeric Grade", "Letter Grade", "Grade Weight");
        System.out.println("--------------------------------------------------------------------");

        for (int i = 0; i < courses.length; i++) {
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n", 
                              courses[i], numericGrades[i], letterGrades[i], gradeWeights[i]);
        }

        System.out.println("--------------------------------------------------------------------");
        System.out.printf("\nGPA : %.2f\n", gpa);
    }
}
