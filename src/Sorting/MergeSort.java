package Sorting;

public class MergeSort {

    // time complexity = O(n log n)
    // space complexity = O(n)

    public MergeSort(int[]array) {
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }

    public void mergesort(int[] array){
        int length = array.length;
        // base case
        if(length <= 1){
            return;
        }

        // find the middle position
        int mid = length/2;

        // create new two subarrays
        int[]leftArray = new int[mid];
        int[]rightArray = new int[length-mid];

        int i = 0; //left array
        int j = 0; //right array

        for(;i<length; i++){
            // check if the i is less than mid then add that value
            // to the left array else i is greater than mid the value will add to the right array
            if(i<mid){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }

        // for the recurstion call methods
        mergesort(leftArray);
        mergesort(rightArray);
        merge(leftArray,rightArray,array);

    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length/2;
        int rightSize = array.length-leftSize;

        // indices
        // i - for the original array to keep track of the position
        // l - left array
        // r - right array
        int i=0, l=0, r=0;

        // check the conditions for merging
        while (l < leftSize && r < rightSize) {
            // if the conndition is tru we can add the elements to the original array
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[r] = rightArray[i];
                i++;
                r++;
            }
        }

        while(l<leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r<rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }

}
