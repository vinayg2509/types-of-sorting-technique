package com.bridgelabz.typeofsorting;

public class MergeSort {

    public static void main(String[] args) {
        int[] bookPrice = {343, 223, 232, 43, 123};

        // Start the divide and sort process
        divide(bookPrice, 0, bookPrice.length - 1);

        // Print the sorted array
        for (int price : bookPrice) {
            System.out.print(price + " ");
        }
    }

    // Method to divide the array recursively
    static void divide(int[] bookPrice, int start, int end) {
        if (start >= end) {
            return; // Base case: array of 1 element
        }

        // Correct mid calculation based on start and end
        int mid = start + (end - start) / 2;

        // Recursively divide both halves
        divide(bookPrice, start, mid);
        divide(bookPrice, mid + 1, end);

        // Merge the sorted halves
        mergeSort(bookPrice, start, mid, end);
    }

    // Method to merge two sorted subarrays
    static void mergeSort(int[] bookPrice, int start, int mid, int end) {
        int[] merge = new int[end - start + 1]; // Temp array to hold merged result
        int idx1 = start;      // Pointer for left half
        int idx2 = mid + 1;    // Pointer for right half
        int mindex = 0;        // Index for merge array

        // Merge the two halves into temp array
        while (idx1 <= mid && idx2 <= end) {
            if (bookPrice[idx1] <= bookPrice[idx2]) {
                merge[mindex++] = bookPrice[idx1++];
            } else {
                merge[mindex++] = bookPrice[idx2++];
            }
        }

        // Copy remaining elements from left half
        while (idx1 <= mid) {
            merge[mindex++] = bookPrice[idx1++];
        }

        // Copy remaining elements from right half
        while (idx2 <= end) {
            merge[mindex++] = bookPrice[idx2++];
        }

        // Copy merged array back into original array
        for (int i = 0; i < merge.length; i++) {
            bookPrice[start + i] = merge[i];
        }
    }
}
