package com.bridgelabz.typeofsorting;

public class QuickSort
{
    public static void main(String[] args) {
      int[]productPrice={299,392,452,11,234,98};
      int n=productPrice.length;

      quickSort(productPrice,0,n-1);
      for ( int price:productPrice)
      {
          System.out.print(price+" ");
      }
    }

    private static void quickSort(int[] productPrice, int low, int high)
    {
        if(low<high)
        {
            int piIdx=partion(productPrice,low,high);

            quickSort(productPrice,low,piIdx-1);
            quickSort(productPrice,piIdx+1,high);

        }
    }

    private static int partion(int[] productPrice, int low, int high)
    {
        int pivot=productPrice[high];
        int pidex=low-1;


        for(int i=low;i<high;i++)
        {
            //compare
            if(productPrice[i]<pivot)
            {
                pidex++;
                //swap
                int  temp=productPrice[pidex];
                productPrice[pidex]=productPrice[i];
                productPrice[i]=temp;
            }

        }
        pidex++;
       int temp=productPrice[pidex];
        productPrice[pidex]=pivot;
        productPrice[high]=temp;

        return  pidex;
    }
}
