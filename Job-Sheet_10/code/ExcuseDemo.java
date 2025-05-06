import java.util.Scanner;

public class ExcuseDemo 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExcuseLetterStack17 letterStack = new ExcuseLetterStack17();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Class Name: ");
                    String className = scanner.nextLine();
                    System.out.print("Enter Type of Excuse (S/I): ");
                    char type = scanner.nextLine().charAt(0);
                    System.out.print("Enter Duration: ");
                    int duration = scanner.nextInt();
                    scanner.nextLine();

                    ExcuseLetter17 letter = new ExcuseLetter17(id, name, className, type, duration);
                    letterStack.submitLetter(letter);
                    System.out.println("Excuse Letter submitted successfully.");
                    break;

                case 2:
                    ExcuseLetter17 processedLetter = letterStack.processLetter();
                    if (processedLetter != null) {
                        System.out.println("Processed Letter: ");
                        System.out.printf("%-8s %-8s %-12s %-6s %-8s\n", "ID", "Name", "Class Name", "Type", "Duration");
                        processedLetter.display();
                    } else {
                        System.out.println("No letters to process.");
                    }
                    break;

                case 3:
                    ExcuseLetter17 latestLetter = letterStack.viewLatestLetter();
                    if (latestLetter != null) {
                        System.out.println("Latest Letter: ");
                        System.out.printf("%-8s %-8s %-12s %-6s %-8s\n", "ID", "Name", "Class Name", "Type", "Duration");
                        latestLetter.display();
                    } else {
                        System.out.println("No letters in the stack.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the name to search: ");
                    String searchName = scanner.nextLine();
                    boolean found = letterStack.searchLetter(searchName);
                    if (found) {
                        System.out.println("Letter found for student: " + searchName);
                    } else {
                        System.out.println("No letter found for student: " + searchName);
                    }
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
