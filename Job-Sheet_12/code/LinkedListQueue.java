public class LinkedListQueue {
    Node front;
    Node rear;
    int size;
    int maxSize;

    LinkedListQueue(int maxSize) {
        front = null;
        rear = null;
        size = 0;
        this.maxSize = maxSize;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size >= maxSize;
    }

    void clear() {
        front = null;
        rear = null;
        size = 0;
    }

    void enqueue(Student student) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add more students.");
            return;
        }
        Node newNode = new Node(student);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    Student dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No student to call.");
            return null; 
        }
        Student dequeuedStudent = front.student;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return dequeuedStudent;
    }

    Student getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front student.");
            return null; 
        }
        return front.student;
    }

    Student getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No rear student.");
            return null; 
        }
        return rear.student;
    }

    int getSize() {
        return size;
    }
}
