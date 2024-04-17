 public class SelectionSort{
	 public void selectionSort(int[] arra) {
        for (int i = 0; i < arra.length - 1; i++) {
            int smallest_index = i;
            for (int j = i; j < arra.length; j++) {
                if (arra[j] < arra[smallest_index]) {
                    smallest_index = j;
                }
            }
            int temp = arra[smallest_index];
            arra[smallest_index] = arra[i];
            arra[i] = temp;
        }
        for (int num : arra) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
 }