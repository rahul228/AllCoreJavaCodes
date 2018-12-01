package Assignment3_HW;

import java.util.Scanner;

public class P8 {

	  
    static void rearrange(int arr[], int n) 
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++)
            {
                if (arr[i] <0)
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
     
    // Driver code
    public static void main(String args[]) 
    {
       Scanner sc=new Scanner(System.in);
     /*  System.out.println("Enter how many elements you want in your array");
       int a=sc.nextInt();
       int arr[]=new int[a];
       int n=arr.length;
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=sc.nextInt();
       }*/
       int arr[]= {12,2,0,-5,0,-4,13};
       int n=arr.length;
        rearrange(arr, n);
        printArray(arr, n);
    }

}
