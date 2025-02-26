public class LecturerMain {
    public static void main(String[] args) {
        // Instantiate object lecturer1 using default constructor
        Lecturer lecturer1 = new Lecturer();
        lecturer1.lecturerID = "L001";
        lecturer1.name = "Imam";
        lecturer1.status = true;
        lecturer1.startYear = 2010;
        lecturer1.expertiseField = "Computer Science";
        lecturer1.print();
        lecturer1.setStatus(false);
        System.out.println("Tenure: " + lecturer1.calculateTenure(2024) + " years");
        lecturer1.changeExpertiseField("Master of Theology");

        // Instantiate object lecturer2 using parameterized constructor
        Lecturer lecturer2 = new Lecturer("L002", "Dr. Johnson", true, 2015, "Mathematics");
        lecturer2.print();
        lecturer2.setStatus(true);
        System.out.println("Tenure: " + lecturer2.calculateTenure(2024) + " years");
        lecturer2.changeExpertiseField("Data Science");
    }
}