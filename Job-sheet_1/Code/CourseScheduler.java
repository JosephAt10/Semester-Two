import java.util.Scanner;

public class CourseScheduler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int n = input.nextInt();
        input.nextLine(); 

        String[] courseNames = new String[n];
        int[] creditHours = new int[n];
        int[] semesters = new int[n];
        String[] lectureDays = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for course " + (i + 1) + ":");
            System.out.print("Course Name: ");
            courseNames[i] = input.nextLine();
            System.out.print("Credit Hours (SKS): ");
            creditHours[i] = input.nextInt();
            System.out.print("Semester: ");
            semesters[i] = input.nextInt();
            input.nextLine(); 
            System.out.print("Lecture Day (e.g., Monday, Tuesday, etc.): ");
            lectureDays[i] = input.nextLine();
        }
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display all courses");
            System.out.println("2. Display courses on a specific day");
            System.out.println("3. Display courses for a specific semester");
            System.out.println("4. Search for a course by name");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    displayAllCourses(courseNames, creditHours, semesters, lectureDays);
                    break;
                case 2:
                    System.out.print("Enter the day to filter (e.g., Monday): ");
                    String day = input.nextLine();
                    displayCoursesByDay(courseNames, creditHours, semesters, lectureDays, day);
                    break;
                case 3:
                    System.out.print("Enter the semester to filter: ");
                    int semester = input.nextInt();
                    input.nextLine(); 
                    displayCoursesBySemester(courseNames, creditHours, semesters, lectureDays, semester);
                    break;
                case 4:
                    System.out.print("Enter the course name to search: ");
                    String searchName = input.nextLine();
                    searchCourseByName(courseNames, creditHours, semesters, lectureDays, searchName);
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    static void displayAllCourses(String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays) {
        System.out.println("\nAll Courses:");
        for (int i = 0; i < courseNames.length; i++) {
            System.out.println("Course Name: " + courseNames[i]);
            System.out.println("Credit Hours: " + creditHours[i]);
            System.out.println("Semester: " + semesters[i]);
            System.out.println("Lecture Day: " + lectureDays[i]);
            System.out.println();
        }
    }
    static void displayCoursesByDay(String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays, String day) {
        System.out.println("\nCourses on " + day + ":");
        boolean found = false;
        for (int i = 0; i < lectureDays.length; i++) {
            if (lectureDays[i].equalsIgnoreCase(day)) {
                System.out.println("Course Name: " + courseNames[i]);
                System.out.println("Credit Hours: " + creditHours[i]);
                System.out.println("Semester: " + semesters[i]);
                System.out.println("Lecture Day: " + lectureDays[i]);
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No courses found on " + day + ".");
        }
    }
    static void displayCoursesBySemester(String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays, int semester) {
        System.out.println("\nCourses in Semester " + semester + ":");
        boolean found = false;
        for (int i = 0; i < semesters.length; i++) {
            if (semesters[i] == semester) {
                System.out.println("Course Name: " + courseNames[i]);
                System.out.println("Credit Hours: " + creditHours[i]);
                System.out.println("Semester: " + semesters[i]);
                System.out.println("Lecture Day: " + lectureDays[i]);
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No courses found for Semester " + semester + ".");
        }
    }
    static void searchCourseByName(String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays, String searchName) {
        boolean found = false;
        for (int i = 0; i < courseNames.length; i++) {
            if (courseNames[i].equalsIgnoreCase(searchName)) {
                System.out.println("\nCourse Found:");
                System.out.println("Course Name: " + courseNames[i]);
                System.out.println("Credit Hours: " + creditHours[i]);
                System.out.println("Semester: " + semesters[i]);
                System.out.println("Lecture Day: " + lectureDays[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No course found with the name: " + searchName);
        }
    }
}