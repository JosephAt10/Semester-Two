import java.util.Scanner;

public class StudentMain {
    Student[] students;
    
    public StudentMain(Student[] students) {
        this.students = students;
    }
    int findMaxMidtermScore(int left, int right) {
        if (left == right) {
            return students[left].midtermScore;
        }
        int mid = (left + right) / 2;
        int leftMax = findMaxMidtermScore(left, mid);
        int rightMax = findMaxMidtermScore(mid + 1, right);
        return Math.max(leftMax, rightMax);
    }
    int findMinMidtermScore(int left, int right) {
        if (left == right) {
            return students[left].midtermScore;
        }
        int mid = (left + right) / 2;
        int leftMin = findMinMidtermScore(left, mid);
        int rightMin = findMinMidtermScore(mid + 1, right);
        return Math.min(leftMin, rightMin);
    }
    double calculateAverageFinalScore() {
        int total = 0;
        for (Student student : students) {
            total += student.finalScore;
        }
        return (double) total / students.length;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                    
        Student[] students = {
            new Student("Ahmad", "220101001", 2022, 78, 82),
            new Student("Budi", "220101002", 2022, 85, 88),
            new Student("Cindy", "220101003", 2021, 90, 87),
            new Student("Dian", "220101004", 2021, 76, 79),
            new Student("Eko", "220101005", 2023, 92, 95),
            new Student("Fajar", "220101006", 2020, 88, 85),
            new Student("Gina", "220101007", 2023, 80, 83),
            new Student("Hadi", "220101008", 2020, 82, 84)
        };

        StudentMain studentMain = new StudentMain(students);
        
        System.out.println("Highest Midterm Score (UTS): " + studentMain.findMaxMidtermScore(0, students.length - 1));
        System.out.println("Lowest Midterm Score (UTS): " + studentMain.findMinMidtermScore(0, students.length - 1));
        System.out.println("Average Final Score (UAS): " + studentMain.calculateAverageFinalScore());
    }
}