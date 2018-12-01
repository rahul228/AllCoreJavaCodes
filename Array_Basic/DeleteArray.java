package Array_Pratice;

import java.util.Scanner;

public class DeleteArray {
	public static void main(String[] args) {
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elemenst you want in your array");
		int b=sc.nextInt();
		System.out.println("Enter the elements of your array");
		for(int i=0;i<b;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("THe array elements are");
		for(int i=0;i<b;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter the data which you want to delete");
		int data=sc.nextInt();
		System.out.println("Enter the position");
		int pos=sc.nextInt();
		for(int i=pos;i<b;i++) {
			
				a[i]=a[i+1];
		
		}
		System.out.println("THe array after deletion is");
		for(int i=0;i<b-1;i++) {
			
			System.out.print(a[i]+" ");
		}
	}
}
