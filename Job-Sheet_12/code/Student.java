public class Student {
  String name;
    String id;
    Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    void printInfo() {
        System.out.println(name + " (ID: " + id + ")");
    }  
}
