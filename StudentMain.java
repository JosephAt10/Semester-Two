public class StudentMain {
    public static void main(String[] args) {
        // Instantiate object student1 using default constructor
        Student student1 = new Student();
        student1.studentID = "244107020097";
        student1.name = "Tiara";
        student1.className = "TI-11";
        student1.gpa = 3.8;
        student1.print();
        student1.changeClass("TI-21");
        student1.updateGPA(3.9);
        student1.print();

        // Instantiate object student2 using parameterized constructor
        Student student2 = new Student("244107020040", "Rizky", "TI-11", 3.5);
        student2.updateGPA(3.3);
        student2.print();

        Student studentJoseph = new Student("244107020242", "Joseph Atem Deng Aruei", "TI-1I", 3.8);
studentJoseph.print();
    }
}
