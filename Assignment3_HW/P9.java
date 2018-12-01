package Assignment3_HW;

import java.util.Scanner;

public class P9 {

	  
    static void rearrange(int arr[], int n) 
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++)
            {
                if (arr[i]%2==0)
                   {
                     temp = arr[i];
                        arr[i] = arr[j];
                     arr[j] = temp;
                     j++;
                   }
            }
    }
     
    static void printArray(int arr[], int n) 
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
     
    public static void main(String args[]) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter how many elements you want in your array");
       int a=sc.nextInt();
       int arr[]=new int[a];
       int n=arr.length;
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=sc.nextInt();
       }
        rearrange(arr, n);
        printArray(arr, n);
    }

}


