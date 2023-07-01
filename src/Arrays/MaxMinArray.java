package Arrays;

import java.util.Scanner;

public class MaxMinArray
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int size;
        System.out.print("Enter Size of an Array : ");
        size = scan.nextInt();

        int input[] = new int[size];

        for(int i=0; i<size; i++)
        {
            System.out.print("Enter Element-" +i +" : ");
            input[i] = scan.nextInt();
        }

        int max = input[0], min = input[0];
        for(int i=0; i<size; i++)
        {
            if(max<input[i])
                max = input[i];
            if(min>input[i])
                min = input[i];
        }

        System.out.println("\n\nMaximum Number : " +max);
        System.out.println("Minimum Number : " +min);
    }
}
