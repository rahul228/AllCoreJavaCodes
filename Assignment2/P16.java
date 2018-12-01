package Assignment2;

import java.util.Scanner;

public class P16 {
	
	static void Even(int a[],int n) {
		int j=0,temp;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
	}
	
	static void Display(int a[],int n) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		System.out.println("Enter how many elements you want in your array");
		int a=c.nextInt();
		int b[]=new int[a];
		int len=b.length;
		for(int i=0;i<b.length;i++) {
			b[i]=c.nextInt();
		}
		Even(b,len);
		Display(b,len);
	}

}
