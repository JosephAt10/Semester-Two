import java.util.Scanner;

public class SLLMain00 {
    public static void main(String[] args) {
        SingleLinkedList00 sll = new SingleLinkedList00();
        Scanner sc = new Scanner(System.in);

        //Question 3 modification
    System.out.println("Enter student details (NIM, Name, Class, GPA):");
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Class: ");
        String className = sc.nextLine();
        System.out.print("GPA: ");
        double gpa = sc.nextDouble();

        Student00 newStudent = new Student00(nim, name, className, gpa);
        sll.addLast(newStudent);
        sll.print();

    Student00 std1 = new Student00("001", "Student 1", "TI-1I", 3.89);
    Student00 std2 = new Student00("002", "Student 2", "TI-1I", 3.45);
    Student00 std3 = new Student00("003", "Student 3", "TI-1I", 3.20);
    Student00 std4 = new Student00("004", "Student 4", "TI-1I", 3.00);

    sll.print();
    sll.addFirst(std4);
    sll.print();
    sll.addLast(std1);
    sll.print();
    sll.insertAfter(std3, "Student 4");
    sll.insertAt(2, std2);
    sll.print();

    //Exp2: modification
    System.out.println("Data at index 1 is:");
    Student00 data = sll.getData(1);
    data.print();

    int idx = sll.indexOf("Student 1");
    System.out.println("Student 1 is located at index: " + idx);

    sll.removeFirst();
    sll.removeLast();
    sll.print();
    sll.removeAt(0);
    sll.print();
   }
}
