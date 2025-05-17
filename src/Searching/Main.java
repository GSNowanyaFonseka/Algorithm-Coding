package Searching;

public class Main {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10,12,14};
        int target = 12;

        BinarySearch bsearch = new BinarySearch();
        System.out.println(bsearch.binarySearch(array, target));

    }
}
