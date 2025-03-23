// import java.util.Scanner;

public class StudentDemo17 {
    public static void main(String[] args) {
        TopStudent17 topStudents = new TopStudent17(5);
        
        topStudents.add(new Student17("2201", "Alice", "A", 3.9));
        topStudents.add(new Student17("2202", "Bob", "B", 3.7));
        topStudents.add(new Student17("2203", "Charlie", "C", 3.8));
        topStudents.add(new Student17("2204", "David", "D", 3.6));
        topStudents.add(new Student17("2205", "Eve", "F", 4.0));

        System.out.println("Original student list:");
        topStudents.print();

        // System.out.println("Sorted student list (by GPA, ascending) using selection sort:");
        // topStudents.selectionSort();
        // topStudents.print();

        // topStudents.bubbleSort();
        // System.out.println();
        // System.out.println("Sorted student list (by GPA, descending):");
        // topStudents.print();
        System.out.println();
        topStudents.insertionSort();
        System.out.println("Sorted student list (by GPA, descending) using Insertion sort:");
        topStudents.print();

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter number of students: ");
        // int size = scanner.nextInt();
        // scanner.nextLine();

        // TopStudent17 topStudents = new TopStudent17(size);

        // for (int i = 0; i < size; i++) {
        //     System.out.println("Enter details for student " + (i + 1) + ":");
        //     System.out.print("NIM: ");
        //     String nim = scanner.nextLine();
        //     System.out.print("Name: ");
        //     String name = scanner.nextLine();
        //     System.out.print("Class: ");
        //     String studentClass = scanner.nextLine();
        //     System.out.print("GPA: ");
        //     double gpa = scanner.nextDouble();
        //     scanner.nextLine(); 

        //     topStudents.add(new Student17(nim, name, studentClass, gpa));
        // }

        // System.out.println("\nOriginal Student List:");
        // topStudents.print();

        // topStudents.bubbleSort();
        // System.out.println("\nSorted Student List (by GPA, descending):");
        // topStudents.print();
    }
}
