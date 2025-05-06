import java.util.Scanner;

public class StudentDemo 
{
    public static void main(String[] args) 
    {
        StudentAssignmentStack17 stack = new StudentAssignmentStack17(5); 
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Submit Assignment");
                System.out.println("2. Grade Assignment");
                System.out.println("3. View Top Assignment");
                System.out.println("4. View Assignment List");
                System.out.println("5. Count the number of assignment");
                System.out.print("Choose a menu: ");
                choice = scan.nextInt();
                scan.nextLine(); 
                
                switch (choice) {
                    case 1:
                        System.out.print("Name: ");
                        String name = scan.nextLine();
                        System.out.print("NIM: ");
                        String nim = scan.nextLine();
                        System.out.print("Class Name: ");
                        String className = scan.nextLine();
                        Student17 student = new Student17(nim, name, className, 0);
                        stack.push(student);
                        System.out.printf("%s's Assignment has been submitted successfully\n ", student.name);
                        break;
                        
                    case 2:
                        Student17 gradedStudent = stack.pop();
                        if (gradedStudent != null) {
                            System.out.println("Grading assignment from " + gradedStudent.name);
                            System.out.print("Enter grade (0-100): ");
                            int grade = scan.nextInt();
                            gradedStudent.grading(grade);
                            System.out.printf("Assignment grade for %s is %d\n", gradedStudent.name, grade);
                            String binary = stack.convertToBinary(grade);
                            System.out.printf("Assignment grade in binary is %s\n", binary); // exp2 modification
                        }
                        break;
                        
                    case 3:
                        Student17 topStudent = stack.peek();
                        if (topStudent != null) {
                            System.out.println("Last submitted assignment is from " + topStudent.name);
                            Student17 first = stack.peekBottom();
                                if (first != null) {
                            System.out.println("First submitted assignment is from " + first.name);
                            }  // qn5 modification
                        }
                        break;
                        
                    case 4:
                        System.out.println("All assignments list");
                        System.out.println("NIM\tName\tClass Name");
                        stack.print();
                        break;
                    case 5:
                        System.out.println("Total assignments: " + stack.countAssignments());
                        break;   //qn6 modification
                    
                        
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice >= 1 && choice <= 5);
        }

    }

