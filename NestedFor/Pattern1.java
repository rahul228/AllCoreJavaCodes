package NestedFor;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		int a=sc.nextInt();
		System.out.println("Enter the column");
		int b=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				if(j%2==0) {
					System.out.print("@");
				}
				else {
					System.out.print("*");
				}
					
			}System.out.println();
		}
	}

}
