package Sorting;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[]array = {2,1,3,4,7,5,6,8,5};

        System.out.println("Sorted with bubble sort algorithm");
        BubbleSort bubblleSort = new BubbleSort();
        bubblleSort.BubbleSort(array);

        System.out.println("\nSorted with selection sort algorithm");
        SelectionSort selectioSort = new SelectionSort();
        selectioSort.SelectionSort(array);

        System.out.println("\nSorted with merge sort algorithm");
        MergeSort mergeSort = new MergeSort(array);
        mergeSort.mergesort(array);
    }
}