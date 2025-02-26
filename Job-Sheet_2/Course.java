public class Course {
    // Attributes
    String courseID;
    String name;
    int credit;
    int hour;

    // Default Constructor
    public Course() {
    }

    // Parameterized Constructor
    public Course(String courseID, String name, int credit, int hour) {
        this.courseID = courseID;
        this.name = name;
        this.credit = credit;
        this.hour = hour;
    }

    // Methods
    public void print() {
        System.out.println("Course ID : " + courseID);
        System.out.println("Name : " + name);
        System.out.println("Credit : " + credit);
        System.out.println("Hour : " + hour);
    }

    public void changeCredit(int newCredit) {
        credit = newCredit;
        System.out.println("Credit changed to: " + newCredit);
    }

    public void addHour(int hour) {
        this.hour += hour;
        System.out.println("Added " + hour + " hours. Total hours: " + this.hour);
    }

    public void reduceHour(int hour) {
        if (this.hour - hour >= 0) {
            this.hour -= hour;
            System.out.println("Reduced " + hour + " hours. Total hours: " + this.hour);
        } else {
            System.out.println("Cannot reduce hours. Insufficient hours remaining.");
        }
    }
}