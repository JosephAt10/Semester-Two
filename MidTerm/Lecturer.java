public class Lecturer 
{
    String nidn;
    String lecturerName;

    public Lecturer(String nidn, String lecturerName) 
    {
        this.lecturerName = lecturerName;
        this.nidn = nidn;
    }

    void showData() {
        System.out.println("NIDN: " + nidn);
        System.out.println("Lecturer Name: " + lecturerName);

    }
}