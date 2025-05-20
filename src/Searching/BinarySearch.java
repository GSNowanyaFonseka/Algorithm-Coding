package Searching;

public class BinarySearch {

    // time complexity = O(log n)
    // space complexity = O(1)

    public int binarySearch(int[]array,int target){

        int low = 0;
        int max = array.length-1;


        while(low<=max) {
            int mid = (low+max)/2;
            if (array[mid] == target) {
                return mid;
            } else if(array[mid] >target){
                max=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return -1;

    }
}
