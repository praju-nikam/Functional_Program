package com.java.SumOfThreeIntegerAddsToZero;

import java.util.Scanner;

public class integer
{
     static void FindTriplets(int arr[], int n)
     {
         boolean found = false;
         for(int i=0; i<n-2; i++)
         {
             for(int j=i+1; j<n-1; j++)
             {
                 for(int k=j+1; k<n; k++)
                 {
                     if(arr[i] + arr[j] + arr[k] == 0)
                     {
                         System.out.println(arr[i]);
                         System.out.println(" ");
                         System.out.println(arr[j]);
                         System.out.println(" ");
                         System.out.println(arr[k]);
                         System.out.println(" ");
                         found = true;
                     }
                 }
             }
         }
         if( found == false)
         {
             System.out.println("No Triplets Found ");
         }
     }
    public static void main(String args[])
    {
        //System.out.println("Enter Elements In Array");
        //Scanner sc=new Scanner(System.in);
        int arr[] = {0,-1,2,-3,1};
        int  n = arr.length;
        FindTriplets(arr,n);
    }
}
