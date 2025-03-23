public class LecturerData {
    Lecturer[] lecturerData;
    int idx;

    public LecturerData(int size) {
        lecturerData = new Lecturer[size];
        idx = 0;
    }
    public void add(Lecturer lecturer) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = lecturer;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }
    public void print() {
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
    }
    public void bubbleSortASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }  
    public void SelectionSortDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[maxIdx].age) {
                    maxIdx = j;
                }
            }
            Lecturer temp = lecturerData[maxIdx];
            lecturerData[maxIdx] = lecturerData[i];
            lecturerData[i] = temp;

        }
    }
}
