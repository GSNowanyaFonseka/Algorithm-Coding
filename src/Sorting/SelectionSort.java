package Sorting;

public class SelectionSort {

    // time complexity = O(n^2)
    // space complexity = O(1)

    public static void SelectionSort(int[] array){
        int min=0;

        for(int i=0;i<array.length;i++){
            min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }

    }

}
