package com.bridgelabz.typeofsorting;

public class InsertionSort
{
    public static void main(String[] args) {
        int [] emmpId={343,223,232,43,123};
        int[] result =insertionSort(emmpId);

        // Print the sorted array
        for (int res : result) {
            System.out.print(res + " ");
        }
    }

     static int[] insertionSort(int[] emmpId)
     {
        for (int i=1;i<emmpId.length;i++)
        {
            int current=emmpId[i];
            int j=i-1;
            while (j>=0 && current <emmpId[j])
            {
                emmpId[j+1]=emmpId[j];
                j--;
            }
            emmpId[j+1]=current;
        }

            return emmpId;
     }
}
