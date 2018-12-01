package Assignment2;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elemts you want in your array");
		int b;
		int a[]=new int[b=sc.nextInt()];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==65 || a[i]==78) {
				System.out.println(a[i]);
			}
			
		}

	}

}
