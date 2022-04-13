package SelectionSort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        SelectionSort.sort(numbers);
    }
    
    // Selection sort algorithm based on methods implemented below
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }    
    
    
    // Find smallest value
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    // Return index of smallest value
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    // Return index of smallest value from a certain index onwards
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}