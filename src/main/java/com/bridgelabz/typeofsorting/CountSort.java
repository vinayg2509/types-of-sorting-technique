package com.bridgelabz.typeofsorting;

public class CountSort
{
    public static void main(String[] args)
    {
        int []studentsAge= {10,18,26,12,14,15,17,18};
        int[] res=countSort(studentsAge);
        for(int re:res)
        {
            System.out.print(re+" ");
        }
    }

    static int[] countSort(int[] studentsAge)
    {
        int max=studentsAge[0];


        for(int num:studentsAge)
        {
            if(num>max)
            {
                max=num;
            }

        }

        int[] counts =new int [max+1];

        for(int num :studentsAge)
        {
            counts[num]++;

        }

        int index=0;
        for(int i=0;i<counts.length;i++)
        {
            while(counts[i]>0)
            {
                studentsAge[index++]=i;
                counts[i]--;
            }
        }

        return studentsAge;
    }
}
