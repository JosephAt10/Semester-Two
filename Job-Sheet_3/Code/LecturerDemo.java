import java.util.Scanner;

public class LecturerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lecturer[] lecturers = new Lecturer[5];

        for (int i = 0; i < lecturers.length; i++) {
            System.out.println("Enter details for Lecturer " + (i + 1) + ":");
            System.out.print("Enter ID: ");
            String id = sc.next();
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter gender (true for Male, false for Female): ");
            boolean gender = sc.nextBoolean();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            lecturers[i] = new Lecturer(id, name, gender, age);
            System.out.println(); 
        }

        System.out.println("All Lecturer Data:");
        showAllLecturerData(lecturers);

        int maleCount = countLecturerByGender(lecturers, true);
        int femaleCount = countLecturerByGender(lecturers, false);
        System.out.println("Male Lecturers: " + maleCount);
        System.out.println("Female Lecturers: " + femaleCount);

        double maleAvgAge = averageLecturerAgeByGender(lecturers, true);
        double femaleAvgAge = averageLecturerAgeByGender(lecturers, false);
        System.out.println("Average Age of Male Lecturers: " + maleAvgAge);
        System.out.println("Average Age of Female Lecturers: " + femaleAvgAge);

        System.out.println();
        showOldestLecturerInfo(lecturers);
        System.out.println();
        showYoungestLecturerInfo(lecturers);
    }

    public static void showAllLecturerData(Lecturer[] lecturerArray) {
        for (Lecturer l : lecturerArray) {
            l.print();
            System.out.println();
        }
    }

    public static int countLecturerByGender(Lecturer[] lecturerArray, boolean gender) {
        int count = 0;
        for (Lecturer l : lecturerArray) {
            if (l.gender == gender) {
                count++;
            }
        }
        return count;
    }

    public static double averageLecturerAgeByGender(Lecturer[] lecturerArray, boolean gender) {
        int totalAge = 0, count = 0;
        for (Lecturer l : lecturerArray) {
            if (l.gender == gender) {
                totalAge += l.age;
                count++;
            }
        }
        return count == 0 ? 0 : (double) totalAge / count;
    }

    public static void showOldestLecturerInfo(Lecturer[] lecturerArray) {
        Lecturer oldest = lecturerArray[0];
        for (Lecturer l : lecturerArray) {
            if (l.age > oldest.age) {
                oldest = l;
            }
        }
        System.out.println("Oldest Lecturer:");
        oldest.print();
    }

    public static void showYoungestLecturerInfo(Lecturer[] lecturerArray) {
        Lecturer youngest = lecturerArray[0];
        for (Lecturer l : lecturerArray) {
            if (l.age < youngest.age) {
                youngest = l;
            }
        }
        System.out.println("Youngest Lecturer:");
        youngest.print();
    }
}
