public class TopStudent17 {
    Student17[] listStudents;
    int idx;

    public TopStudent17(int size) {
        listStudents = new Student17[size];
        idx = 0;
    }

    public void add(Student17 student) {
        if (idx < listStudents.length) {
            listStudents[idx] = student;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listStudents[i].print();
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listStudents[j].gpa < listStudents[j + 1].gpa) {
                    Student17 temp = listStudents[j];
                    listStudents[j] = listStudents[j + 1];
                    listStudents[j + 1] = temp;
                }
            }
        }
    }
    public void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (listStudents[j].gpa < listStudents[minIdx].gpa) {
                    minIdx = j;
                }
            }
            Student17 temp = listStudents[minIdx];
            listStudents[minIdx] = listStudents[i];
            listStudents[i] = temp;
        }
    }  
    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Student17 temp = listStudents[i];
            int j = i;
            while (j > 0 && listStudents[j-1].gpa < temp.gpa) {
                listStudents[j] = listStudents[j-1];
                j--;
            }
            listStudents[j] = temp;
        }
    }      
 }

    




