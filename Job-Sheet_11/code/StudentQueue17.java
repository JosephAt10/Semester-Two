public class StudentQueue17{
    Student17[] data;
    int front, rear, size, max;
    int processedCount;

    public StudentQueue17(int n) {
        max = n;
        data = new Student17[max];
        size = 0;
        front = 0;
        rear = -1;
        processedCount = 0;
    }

    boolean isFull() {
        return size == max;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void clear() {
        front = 0;
        rear = -1;
        size = 0;
        processedCount = 0;
        System.out.println("Queue cleared.");
    }

    void enqueue(Student17 dt) {
        if (isFull()) {
            System.out.println("Queue is full!!!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = dt;
        size++;
        System.out.printf("%s is successfully added to the queue.\n", dt.name);
    }

    Student17 dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return null;
        }
        Student17 dt = data[front];
        front = (front + 1) % max;
        size--;
        processedCount++;
        return dt;
    }

    void processKRSApproval() {
        System.out.println("Processing KRS approval for up to 2 students...");
        for (int i = 0; i < 2; i++) {
            Student17 processed = dequeue();
            if (processed != null) {
                System.out.print("Processed: ");
                processed.print();
            }
        }
    }

    void showAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }
        System.out.println("Students in the queue:");
        int i = front;
        for (int count = 0; count < size; count++) {
            data[i].print();
            i = (i + 1) % max;
        }
    }

    void showFirstTwo() {
        if (size < 2) {
            System.out.println("Not enough students in the queue.");
            return;
        }
        System.out.println("First two students in line:");
        data[front].print();
        data[(front + 1) % max].print();
    }

    void showLast() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }
        System.out.println("Last student in the queue:");
        data[rear].print();
    }

    void showStats() {
        System.out.println("Total in queue: " + size);
        System.out.println("Processed: " + processedCount);
        System.out.println("Unprocessed: " + (max - processedCount));
    }
}

           
