class SearchStudent {
    Students[] listStd;
    int idx;

    public SearchStudent(int size) {
        listStd = new Students[size];
        idx = 0;
    }

    public void add(Students std) {
        if(idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }

    public void display() {
        for (Students student : listStd) {
            if(student != null) {
                student.display();
                System.out.println("---");
            }
        }
    }

    public int findSeqSearch(int search) {
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if(listStd[i] != null && listStd[i].nim == search) {
                position = i;
                break;
            }
        }
        return position;
    }

    public void showPosition(int x, int pos) {
        if(pos != -1) {
            System.out.println("Data : "+x+" is found in index-"+pos);
        } else {
            System.out.println("Data : "+x+" is not found");
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
        if(pos != -1) {
            System.out.println("NIM \t   : " + x);
            System.out.println("Name \t   : " + listStd[pos].name);
            System.out.println("Age \t   : " + listStd[pos].age);
            System.out.println("IPK \t   : " + listStd[pos].gpa);
        } else {
            System.out.println("Data " + x + " is not found");
        }
    }
}


