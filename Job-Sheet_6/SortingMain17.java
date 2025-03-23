public class SortingMain17 {
    public static void main(String[] args) {
        int [] a = {34, 7, 23, 32, 5, 62};
        int [] b = {30, 20, 2, 8, 14}; 
        int [] c = {40, 10, 4, 9, 3};            
        Sorting17 sorting = new Sorting17(a);
        Sorting17 sorting2 = new Sorting17(b);
        Sorting17 sorting3 = new Sorting17(c);      

        System.out.println("Original array");
        sorting3.print();
        sorting3.bubbleSort();  
        System.out.println("Sorted array (Insertion Sort):");  
        sorting.print();         
    }
}
