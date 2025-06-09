public class BinaryTreeArrayMain17 {
    public static void main(String[] args) {
        BinaryTreeArray17 bta = new BinaryTreeArray17();
        Student00 m1 = new Student00("244107020138", "Devin", "TI-1I", 3.57);
        Student00 m2 = new Student00("244107020138", "Dewi", "TI-1I", 3.85);
        Student00 m3 = new Student00("244107020138", "Wahyu", "TI-1I", 3.21);
        Student00 m4 = new Student00("244107020138", "Angelina", "TI-1I", 3.54);
        Student00 m5 = new Student00("244107020138", "Andhika", "TI-1I", 3.72);
        Student00 m6 = new Student00("244107020138", "Bima", "TI-1I", 3.37);
        Student00 m7 = new Student00("244107020138", "Eiyu", "TI-1I", 3.46);

        Student00[] data = {m1, m2, m3, m4, m5, m6, m7};
        bta.populateData(data, data.length-1);
        System.out.println("In-order traversal");
        bta.traverseInOrder(0);

        //Assignment moodification
        System.out.println("-----------------------------");
        System.out.println("In-order traversal (array):");
        bta.traverseInOrder(0);

        System.out.println("-----------------------------");
        System.out.println("Pre-order traversal (array):");
        bta.traversePreOrder(0);
    }
    
}
