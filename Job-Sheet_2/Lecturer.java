public class Lecturer {
    // Attributes
    String lecturerID;
    String name;
    boolean status;
    int startYear;
    String expertiseField;

    // Default Constructor
    public Lecturer() {
    }

    // Parameterized Constructor
    public Lecturer(String lecturerID, String name, boolean status, int startYear, String expertiseField) {
        this.lecturerID = lecturerID;
        this.name = name;
        this.status = status;
        this.startYear = startYear;
        this.expertiseField = expertiseField;
    }

    // Methods
    public void print() {
        System.out.println("Lecturer ID : " + lecturerID);
        System.out.println("Name : " + name);
        System.out.println("Status : " + (status ? "Active" : "Inactive"));
        System.out.println("Start Year : " + startYear);
        System.out.println("Expertise Field : " + expertiseField);
    }

    public void setStatus(boolean status) {
        this.status = status;
        System.out.println("Status updated to: " + (status ? "Active" : "Inactive"));
    }

    public int calculateTenure(int yearNow) {
        return yearNow - startYear;
    }

    public void changeExpertiseField(String newField) {
        expertiseField = newField;
        System.out.println("Expertise field changed to: " + newField);
    }
}
