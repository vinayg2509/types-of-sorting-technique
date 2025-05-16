package com.bridgelabz.typeofsorting;

public class BubbleSort
{
    // Method to perform bubble sort on an array of integers
    static int[] bubbleSort(int[] marks) {
        // Outer loop for each pass through the array
        // After each pass, the largest unsorted element bubbles to the end
        for (int i = 0; i < marks.length - 1; i++) {
            // Inner loop for comparing adjacent elements
            // The range shortens with each pass (i.e., -i)
            for (int j = 0; j < marks.length - i - 1; j++) {
                // If the current element is greater than the next, swap them
                if (marks[j] > marks[j + 1]) {
                    int swap = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = swap;
                }
            }
        }
        // Return the sorted array
        return marks;
    }

    public static void main(String[] args) {
        // Initialize an array with unsorted integers
        int[] marks = {50,35,28,90,98,100,37};

        // Call the bubbleSort method and store the result
        int[] results = bubbleSort(marks);

        // Print the sorted array
        for (int res:results) {
            System.out.print(res + " ");
        }
    }
}
