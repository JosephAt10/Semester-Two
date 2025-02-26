public class CourseMain {
    public static void main(String[] args) {
        // Instantiate object course1 using default constructor
        Course course1 = new Course();
        course1.courseID = "C001";
        course1.name = "Data Structures and algorithm";
        course1.credit = 3;
        course1.hour = 6;
        course1.print();
        course1.changeCredit(4);
        course1.addHour(1);
        course1.reduceHour(1);

        // Instantiate object course2 using parameterized constructor
        Course course2 = new Course("C002", "System Operation", 2, 4);
        course2.print();
        course2.changeCredit(5);
        course2.addHour(2);
        course2.reduceHour(1);
    }
}