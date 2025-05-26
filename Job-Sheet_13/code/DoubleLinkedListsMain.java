public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        dll.addFirst(new Student("111", "Anton", "TI-1I", 3.57));
        dll.print();
        dll.addLast(new Student("112", "Prabowo", "TI-1I", 3.7));
        dll.print();
        dll.addFirst(new Student("113", "Herco", "TI-1I", 3.89));
        dll.print();
        dll.insertAfter("111", new Student("114", "Rizki", "TI-1I", 3.8));
        dll.print();
        dll.insertAfter("112", new Student("115", "Hanzel", "TI-1I", 3.6));
        dll.print();
        dll.insertAfter("120", new Student("116", "Eiyu", "TI-1I", 3.4));
        dll.print();

        //Assignment modification
        System.out.println("Added student at index 2:");
        dll.add(2, new Student("116", "Joseph", "TI-1I", 3.85));
        dll.print();

        System.out.println("Remove after NIM 111:");
        dll.removeAfter("111");
        dll.print();

        System.out.println("Get first: ");
        Student first = dll.getFirst();
        if (first != null) first.print();

        System.out.println("Get last: ");
        Student last = dll.getLast();
        if (last != null) last.print();

        System.out.println("Get index 2: ");
        Student mid = dll.get(2);
        if (mid != null) mid.print();
        
        System.out.println("Size:");
        System.out.println("Size of list: " + dll.size());
        
        System.out.println("Index Of:");
        System.out.println("Index of NIM 115: " + dll.indexOf("115"));
        System.out.println("Index of NIM 999 (not found): " + dll.indexOf("999"));

        //Exp2:
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        dll.remove(1);
        dll.print();
    }
}
