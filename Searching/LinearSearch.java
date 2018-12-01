package Searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,6};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data you want to search");
		int d=sc.nextInt();
		for (int i = 0; i< a.length;i++) 
		{
			if(a[i]==d) {
				System.out.println("Found at "+i);
			}
		}
		

	}

}
