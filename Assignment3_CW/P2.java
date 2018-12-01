package Assignment3_CW;

import java.util.Scanner;

public class P2 {
public static void main(String[] args) {
	int a[]=new int[4];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the elements of the array");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
		
	}int avg=sum/a.length;
	System.out.println(avg);
}
}
