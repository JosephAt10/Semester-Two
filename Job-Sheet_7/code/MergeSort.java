public class MergeSort {
    
    public void mergeSort(int[] data) {
        sort(data, 0, data.length - 1);
    }
    private void merge(int data[], int left, int mid, int right) {
        int[] temp = new int[data.length];
       
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        
        int a = left;       
        int b = mid + 1;    
        int c = left;       
        
        while (a <= mid && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int remaining = mid - a;
        for (int i = 0; i <= remaining; i++) {
            data[c + i] = temp[a + i];
        }
    }
    private void sort(int data[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(data, left, mid);
            sort(data, mid + 1, right);
            merge(data, left, mid, right);
        }
    }
    
    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] data = {10, 40, 30, 50, 70, 20, 100, 90};
        MergeSort sorter = new MergeSort();
        
        System.out.println("Sorting with merge sort");
        System.out.println("Initial Data: ");
        sorter.printArray(data);
        
        sorter.mergeSort(data);
        
        System.out.println("Sorted Data: ");
        sorter.printArray(data);
    }
}
