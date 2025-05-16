package com.bridgelabz.typeofsorting;

public class SelectionSort {

    // Method to perform selection sort on an integer array
    static int[] selectionSort(int[] empId) {

        // Loop through each element in the array (except the last one)
        for (int i = 0; i < empId.length - 1; i++) {
            int smallest = i; // Assume the current index has the smallest value

            // Find the index of the smallest element in the remaining unsorted array
            for (int j = i + 1; j < empId.length; j++) {
                if (empId[smallest] > empId[j]) {
                    smallest = j; // Update smallest if a smaller element is found
                }
            }

            // Swap the smallest element found with the element at current index
            int temp = empId[smallest];
            empId[smallest] = empId[i];
            empId[i] = temp;
        }

        return empId; // Return the sorted array
    }

    public static void main(String[] args) {

        // Unsorted array of employee IDs
        int[] empId = {1544, 1730, 100, 98, 1};

        // Call the selectionSort method
        int[] result = selectionSort(empId);

        // Print the sorted array
        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}
