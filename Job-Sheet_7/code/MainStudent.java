
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int amountStudent = s.nextInt();
        SearchStudent data = new SearchStudent(amountStudent);

        System.out.println("-----------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("--------------");
            System.out.print("NIM\t :");
            int nim = s.nextInt();
            s.nextLine();
            System.out.print("Name\t :");
            String name = s.nextLine();
            System.out.print("Age\t :");
            int age = s.nextInt();
            System.out.print("GPA\t :");
            double gpa = s.nextDouble();

            Students std = new Students(nim, age, name, gpa);
            data.add(std);
        }

        System.out.println("-----------------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("=========================");
        System.out.print("Search student by NIM: ");
        int search = s.nextInt();
        System.out.println("Using Binary Search");
        int position = data.findBinarySearch(search, 0, data.listStd.length - 1);

        data.showPosition(search, position);
        data.showData(search, position);
    }
}

class SearchStudent {
    Students[] listStd;
    int idx;

    public SearchStudent(int size) {
        listStd = new Students[size];
        idx = 0;
    }

    public void add(Students std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }

    public void display() {
        for (Students student : listStd) {
            if (student != null) {
                student.display();
                System.out.println("---");
            }
        }
    }

    public int findSeqSearch(int search) {
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i] != null && listStd[i].nim == search) {
                position = i;
                break;
            }
        }
        return position;
    }

    public void showPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " is found in index-" + pos);
        } else {
            System.out.println("Data : " + x + " is not found");
        }
    }

    public int findBinarySearch(int search, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (search == listStd[mid].nim) {
                return (mid);
            } else if (listStd[mid].nim > search) {
                return findBinarySearch(search, left, mid - 1);
            } else {
                return findBinarySearch(search, mid + 1, right);
            }
        }
        return -1;
    }

    public void showData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t   : " + x);
            System.out.println("Name \t   : " + listStd[pos].name);
            System.out.println("Age \t   : " + listStd[pos].age);
            System.out.println("IPK \t   : " + listStd[pos].gpa);
        } else {
            System.out.println("Data " + x + " is not found");
        }
    }
}

class Students {
    int nim, age;
    String name;
    double gpa;

    public Students(int nim, int age, String name, double gpa) {
        this.nim = nim;
        this.age = age;
        this.name = name;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("NIM = " + nim);
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("GPA = " + gpa);
    }
}

    

