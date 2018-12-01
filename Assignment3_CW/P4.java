package Assignment3_CW;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[3][];
		a[0]=new int[2];
		a[1]=new int[2];
		a[2]=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element in rows");
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}System.out.println("The elements of the array are");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+ " ");
			}System.out.println();
		}
	}

}
