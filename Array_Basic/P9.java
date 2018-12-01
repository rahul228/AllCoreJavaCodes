package Array_Pratice;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you want in your array");
		int b=sc.nextInt();
		System.out.println("Enter the array elements");
		for(int i=0;i<b;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The array you entered is");
		for(int i=0;i<b;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("Enter the location of insertion");
		int l=sc.nextInt();
		System.out.println("Enter the data");
		int d=sc.nextInt();
		for(int i=a.length-2;i>=l-1;i--) {
			a[i+1]=a[i];
		}
		a[l-1]=d;
		System.out.println("The array after insertion is");
		for(int i=0;i<b+1;i++) {
			System.out.print(a[i]+" "); 
		}
	}

}
