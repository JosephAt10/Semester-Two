import java.util.Scanner;

public class LecturerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LecturerData data = new LecturerData(10);
        int choice = 0;
        
        while (choice != 5) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. BubbleSort ASC (Youngest to Oldest)");
            System.out.println("4. SelectionSort DSC (Oldest to Youngest)");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.next();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Gender (true for Male, false for Female): ");
                    boolean gender = sc.nextBoolean();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    data.add(new Lecturer(id, name, gender, age));
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Lecturer Data:");
                    data.print();
                    break;
                case 3:
                    System.out.println();
                    data.bubbleSortASC();
                    System.out.println("Sorted by Age (Youngest to Oldest) using bubbleSort:");
                    data.print();
                    break;
                case 4:
                    System.out.println();
                    data.SelectionSortDSC();
                    System.out.println("Sorted by Age (Oldest to Youngest) using selectionSort:");
                    data.print();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
