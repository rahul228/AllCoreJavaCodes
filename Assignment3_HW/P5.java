package Assignment3_HW;

import java.util.Scanner;

public class P5 {
	static int MissingElement(int a[],int sum) {
		int ress=0;
		for(int i=0;i<a.length;i++) {
			ress=ress+a[i];
		}
		int element=sum-ress;
		return element;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,6,7};
		int sum=0;
		System.out.println("Enter the last element of your array");
		int b=sc.nextInt();
		for(int i=1;i<=b;i++) {
			sum=sum+i;
		}
		int miss=MissingElement(a,sum);
		System.out.println(miss);

	}

}
