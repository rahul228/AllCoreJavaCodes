package Assignment2;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you want in your array");
		int a=sc.nextInt();
		int b[]=new int[a];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<b.length;i++) {
			 b[i]=sc.nextInt();
			}
			for(int i1=0;i1<b.length;i1++) {
				if(b[i1]==0) {
					b[i1]=1;					
			}System.out.print(b[i1]);
			}
	}

}
