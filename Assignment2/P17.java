package Assignment2;

import java.util.Scanner;

public class P17 {
	
	static void Minimum(char a[]) {
		char min='z';
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}System.out.println(min);
	}
	
	static void Maximum(char a[]) {
		char max='A';
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}System.out.println(max);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a=sc.nextInt();
		char b[]=new char[a];
		for(int i=0;i<b.length;i++) {
			b[i]=sc.next().charAt(0);
		}
		System.out.println("What do you want to find?\n1.Maximum\n2.Minimum");
		int s=sc.nextInt();
		if(s==1) {
		Minimum(b);
		}
		else {
		
		Maximum(b);
		}
	}

}
