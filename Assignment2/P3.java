package Assignment2;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter ho many elemts you want in the array");
			int a=sc.nextInt();
			int b[]=new int[5];
			for(int i=0;i<5;i++) {
				b[i]=sc.nextInt();
			}
			System.out.println("The array you entered is ");
			for(int i=0;i<5;i++) {
				System.out.print(b[i]+" ");
			}
			System.out.println("The array in reverse order is");
			for(int i=4;i>=0;i--) {
				System.out.print(b[i]+" ");
			}
	}

}
