package Assignment3_CW;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= new int[10];
		a[0]=23;
		a[1]=21;
		a[2]=3;
		a[3]=4;
		a[4]=10;	
		int size=a.length;
		System.out.println(size);
		System.out.println("Enter at which location you want to add an element");
		int b=sc.nextInt();
		System.out.println("Enter the element you want to add");
		int c=sc.nextInt();
		for(int i=size-1;i>=b;i--) {
			a[i]=a[i-1];
				
		}
		a[b]=c;
		System.out.println("The array after insertion of desired elemet is");
		for(int i=0;i<6;i++) {
			System.out.print(a[i]+" ");
		}
	}
	

}
