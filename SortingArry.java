public class SortingArry {

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] myarray = {11, 28, 55, 102, 6, 25, 12, 3};
        int[] myarray2 = {78, 25, 43, 178, 22, 81, 7, 62};
        int[] myarray3 = {78, 25, 43, 178, 22, 81, 7, 62};
        
        SortingArry shor = new SortingArry();

        SelectionSort selectionSort = new SelectionSort();
        System.out.print("Before sorting array: ");
        shor.printArray(myarray);
        System.out.print("After selection sorting: ");
        selectionSort.selectionSort(myarray);
   
        
        MergeSort mergeSort = new MergeSort();
        System.out.print("Before sorting array: ");
        shor.printArray(myarray2);
        System.out.print("After Merge sorting: ");
        mergeSort.sort(myarray2);
        shor.printArray(myarray2);
        
        QuickSort quickSort = new QuickSort();
        System.out.print("Before sorting array: ");
        shor.printArray(myarray3);
        System.out.print("After Quick sorting: ");
        quickSort.sort(myarray3);
        shor.printArray(myarray3);
    }
}
