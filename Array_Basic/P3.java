package Array_Pratice;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter elements for each row");
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The array elements are");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
