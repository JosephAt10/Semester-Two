public class BinaryTree00 {
    Node00 root;

public BinaryTree00(){
    root = null;
   }
   public boolean isEmpty(){
    return root == null;
   }
   public void add(Student00 data){
    if(isEmpty()){
        root = new Node00(data);
    }else{
        Node00 current = root;
        while(true){
            if(data.ipk < current.data.ipk){
                if(current.left != null){
                    current = current.left;
                }else{
                    current.left = new Node00(data);
                    break;
                }
            }else if(data.ipk > current.data.ipk){
                if(current.right != null){
                    current = current.right;
                }else{
                    current.right = new Node00(data);
                    break;
                }
            }else{
                break;
            }
                }
            }
        }
        public boolean find(double ipk){
            boolean result = false;
            Node00 current = root;
            while (current != null) {
                if(current.data.ipk == ipk){
                    result = true;
                    break;
                }else if(ipk < current.data.ipk){
                    current = current.left;
            }else{
                current = current.right;
            }
        }
        return result;
    }
public void traversePreOrder(Node00 node){
    if (node != null) {
        node.data.print();
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
}
public void traverseInOrder(Node00 node){
    if (node != null) {
        traverseInOrder(node.left);
        node.data.print();
        traverseInOrder(node.right);
    }
}
public void traversePostOrder(Node00 node){
    if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        node.data.print();
    }
}
public Node00 getSuccessor(Node00 del){
    Node00 successor = del.right;
    Node00 successorParent = del;
    while(successor.left != null){
        successorParent = successor;
        successor = successor.left;
    }
    if(successor != del.right){
        successorParent.left = successor.right;
        successor.right = del.right;
    }
    return successor;
   }
   public void delete(double ipk){
    if(isEmpty()){
        System.out.println("Tree is empty!");
        return;
    }
    Node00 parent = root;
    Node00 current = root;
    boolean isLeftChild = false;
    while(current.data.ipk != ipk){
        parent = current;
        if(ipk < current.data.ipk){
            isLeftChild = true;
            current = current.left;
        } else {
            isLeftChild = false;
            current = current.right;
        }
        if (current == null) {
            System.out.println("Couldn't find data");
            return;
        }
      }
      if (current.left == null && current.right == null) {
        if (current == root) {
            root = null;
        }else if(isLeftChild) {
            parent.left = null;
        }else {
            parent.right = null;
        }
      }if (current.right == null) {
        if (current == root) {
            root = current.right;
        }else if(isLeftChild) {
            parent.left = current.right;
        }else {
            parent.right = current.right;
        }
      }else {
        Node00 successor = getSuccessor(current);
        if (current == root) {
            root = successor;
        }else if(isLeftChild) {
            parent.left = successor;
        }else {
            parent.right = successor;
        }
        successor.left = current.left;
      }
    }
    //Assignment modification
 public void addRekursif(Student00 data) {
    root = addRekursif(root, data);
    }

    Node00 addRekursif(Node00 current, Student00 data) {
    if (current == null) {
        return new Node00(data);
    }

    if (data.ipk < current.data.ipk) {
        current.left = addRekursif(current.left, data);
    } else if (data.ipk > current.data.ipk) {
        current.right = addRekursif(current.right, data);
    }
    return current;
 }
 public void getMinIPK() {
    if (isEmpty()) {
        System.out.println("Tree is empty!");
    } else {
        Node00 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.print("Student with min IPK: ");
        current.data.print();
    }
}
public void getMaxIPK() {
    if (isEmpty()) {
        System.out.println("Tree is empty!");
    } else {
        Node00 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.print("Student with max IPK: ");
        current.data.print();
    }
  }
  public void displayStudentsWithIPKAbove(double threshold) {
    displayAbove(root, threshold);
}

void displayAbove(Node00 node, double threshold) {
    if (node != null) {
        displayAbove(node.left, threshold);
        if (node.data.ipk > threshold) {
            node.data.print();
        }
        displayAbove(node.right, threshold);
    }
  }
}
 
