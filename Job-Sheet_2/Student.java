public class Student {
    // Attributes
    String studentID;
    String name;
    String className;
    double gpa;

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(String id, String name, String cls, double gpa) {
        this.studentID = id;
        this.name = name;
        this.className = cls;
        this.gpa = gpa;
    }

    // Methods
    public void print() {
        System.out.println("Student ID : " + studentID);
        System.out.println("Name : " + name);
        System.out.println("Class : " + className);
        System.out.println("GPA : " + gpa);
    }

    public void changeClass(String newClass) {
        className = newClass;
    }

    public void updateGPA(double newGPA) {
        if (newGPA >= 0.0 && newGPA <= 4.0) {
            gpa = newGPA;
        } else {
            System.out.println("Invalid GPA. Must be between 0.0 and 4.0.");
        }
    }

    public String evaluate() {
        if (gpa >= 3.5) {
            return "Excellent";
        } else if (gpa >= 3.0) {
            return "Good";
        } else if (gpa >= 2.0) {
            return "Fair";
        } else {
            return "Poor";
        }
    }
}
