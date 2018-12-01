package Assignment3_CW;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
		}
	}

}
