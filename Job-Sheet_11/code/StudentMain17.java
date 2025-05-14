import java.util.Scanner;

public class StudentMain17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentQueue17 queue = new StudentQueue17(10);
        int choice;

        do {
            System.out.println("\n=== KRS Approval Menu ===");
            System.out.println("1. Add Student to Queue");
            System.out.println("2. Process KRS Approval (2 Students)");
            System.out.println("3. Show All Students in Queue");
            System.out.println("4. Show First Two Students");
            System.out.println("5. Show Last Student");
            System.out.println("6. Show Queue Statistics");
            System.out.println("7. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose a menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    queue.enqueue(new Student17(name, id));
                    break;
                case 2:
                    queue.processKRSApproval();
                    break;
                case 3:
                    queue.showAll();
                    break;
                case 4:
                    queue.showFirstTwo();
                    break;
                case 5:
                    queue.showLast();
                    break;
                case 6:
                    queue.showStats();
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 0);
    }
}