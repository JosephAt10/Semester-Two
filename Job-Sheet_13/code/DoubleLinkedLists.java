public class DoubleLinkedLists {
    Node head;
    Node tail;
    int count;

    DoubleLinkedLists() {
        head = null;
        tail = null;
        count = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        count++;
    }

    void addLast(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        count++;
    }

    void insertAfter(String key, Student data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp == tail) {
                    addLast(data);
                } else {
                    newNode.next = temp.next;
                    newNode.prev = temp;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                }
                count++;
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Insertion failed. Data (" + key + ") not found!!");
        }
    }

    void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Double Linked list is currently empty!!");
        }
    }

    // Exp2:
    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        count--;
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        count--;
    }

    void remove(int index) {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (index < 0) {
            System.out.println("Index cannot be negative!");
        } else if (index >= size()) {
            System.out.println("Index exceeds the size of the DoubleLinkedList!");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            if (temp == tail) {
                removeLast();
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            count--;
        }
    }
    //Assignment modification
    void add(int index, Student data) {
        if (index < 0) {
            System.out.println("Index cannot be negative!");
        } else if (index > size()) {
            System.out.println("Index exceeds the size of the DoubleLinkedList!");
        } else if (index == 0) {
            addFirst(data);
        } else if (index == size()) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
            count++;
        }
    }

    void removeAfter(String key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp == tail) {
                    System.out.println("No node to remove after the specified key!");
                } else {
                    temp.next = temp.next.next;
                    if (temp.next != null) {
                        temp.next.prev = temp;
                    } else {
                        tail = temp;
                    }
                    count--;
                }
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Removal failed. Data (" + key + ") not found!!");
        }
    }

    Student getFirst() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
            return null;
        }
        return head.data;
    }

    Student getLast() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
            return null;
        }
        return tail.data;
    }

    Student get(int index) {
        if (index < 0) {
            System.out.println("Index cannot be negative!");
            return null;
        } else if (index >= size()) {
            System.out.println("Index exceeds the size of the DoubleLinkedList!");
            return null;
        } else if (index == 0) {
            return getFirst();
        } else if (index == size() - 1) {
            return getLast();
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    int size() {
        return count;
    }

    int indexOf(String key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
}





