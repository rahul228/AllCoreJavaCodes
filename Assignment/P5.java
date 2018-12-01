package Assignment;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		int b[] = new int [3];
		System.out.println("Enter the elemts of the array");
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++) {
			b[i]=a[i];
			System.out.println(b[i]);
		}
	}

}
