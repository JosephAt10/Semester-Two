public class BinaryTreeArray17 {
    Student00[] dataArray;
    int idxLast;

    public BinaryTreeArray17(){
        dataArray = new Student00[10];
        idxLast = -1;
    }
    void populateData(Student00[] data, int idxLast){
        this.dataArray = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            if (dataArray[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataArray[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
                
            }
        }
    }
    //Assignment modification
    public void add(Student00 data) {
    if (idxLast < dataArray.length - 1) {
        idxLast++;
        this.dataArray[idxLast] = data;
    } else {
        System.out.println("Tree is full!");
    }
   }

   public void traversePreOrder(int idxStart) {
    if (idxStart <= idxLast && dataArray[idxStart] != null) {
        dataArray[idxStart].print();
        traversePreOrder(2 * idxStart + 1);
        traversePreOrder(2 * idxStart + 2);
    }
  }
}
