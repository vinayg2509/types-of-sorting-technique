package com.bridgelabz.typeofsorting;

public class SelectionSort
{
    static  int[] selectionSort(int[] empId)
    {

        for (int i=0;i<empId.length-1;i++)
        {
            int smallest=i;
            for (int j=i+1;j<empId.length;j++)
            {
                if(empId[smallest]>empId[j])
                {
                    smallest=j;
                }
                int temp=empId[smallest];
                empId[smallest]=empId[i];
                empId[i]=temp;
            }
        }

    return empId;
    }

    public static void main(String[] args) {

        int[] empId={1544,1730,100,98,1};

        int[] result= selectionSort(empId);

        for (int res:result)
        {
            System.out.print(res+" ");
        }

    }
}
