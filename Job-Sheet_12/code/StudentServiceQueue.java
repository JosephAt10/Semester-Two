import java.util.Scanner;

public class StudentServiceQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListQueue queue = new LinkedListQueue(20);

        System.out.println("=== Student Service Queue ===");

        boolean running = true;

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1 - Register student (Add to queue)");
            System.out.println("2 - Call next student (Dequeue)");
            System.out.println("3 - Show front student");
            System.out.println("4 - Show rear student");
            System.out.println("5 - Show total students in queue");
            System.out.println("6 - Check if queue is empty");
            System.out.println("7 - Check if queue is full");
            System.out.println("8 - Clear the queue");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");

            String input = scanner.nextLine(); 
            switch (input) {
                case "1":
                    if (queue.isFull()) {
                        System.out.println("Queue is full. Cannot add more students.");
                        break;
                    }
                    System.out.print("Enter student's full name: ");
                    String name = scanner.nextLine();
                    if (name.isEmpty()) {
                        System.out.println("Name cannot be empty.");
                        break;
                    }
                    System.out.print("Enter student's ID: ");
                    String id = scanner.nextLine();
                    if (id.isEmpty()) {
                        System.out.println("ID cannot be empty.");
                        break;
                    }
                    Student student = new Student(name, id);
                    queue.enqueue(student);
                    System.out.print("Added student: ");
                    student.printInfo();
                    break;

                case "2":
                    Student nextStudent = queue.dequeue();
                    if (nextStudent != null) {
                        System.out.print("Calling next student: ");
                        nextStudent.printInfo();
                    }
                    break;

                case "3":
                    Student frontStudent = queue.getFront();
                    if (frontStudent != null) {
                        System.out.print("Front student: ");
                        frontStudent.printInfo();
                    }
                    break;

                case "4":
                    Student rearStudent = queue.getRear();
                    if (rearStudent != null) {
                        System.out.print("Rear student: ");
                        rearStudent.printInfo();
                    }
                    break;

                case "5":
                    System.out.println("Total students in queue: " + queue.getSize());
                    break;

                case "6":
                    System.out.println(queue.isEmpty() ? "The queue is empty." : "The queue is not empty.");
                    break;

                case "7":
                    System.out.println(queue.isFull() ? "The queue is full." : "The queue is not full.");
                    break;

                case "8":
                    queue.clear();
                    System.out.println("Queue cleared.");
                    break;

                case "0":
                    running = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please enter a number from 0 to 8.");
            }
        }

        scanner.close();
    }
}
