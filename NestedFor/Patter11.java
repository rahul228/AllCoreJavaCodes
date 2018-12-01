package NestedFor;
import java.util.Scanner;
public class Patter11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int a=sc.nextInt();
		System.out.println("Enter the columns");
		int b=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
