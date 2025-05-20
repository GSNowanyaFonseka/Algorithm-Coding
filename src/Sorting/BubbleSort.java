package Sorting;

public class BubbleSort {

    // time complexity = O(n^2)
    // space complexity = O(1)

    public static void BubbleSort(int[]array){

        for(int i=0; i<array.length;i++){
            boolean swapped = false;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }

        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}
