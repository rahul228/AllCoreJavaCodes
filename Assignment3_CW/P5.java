package Assignment3_CW;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,1,6,7,8};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element you want to search");
		int s=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==s) {
				System.out.println("Element found at"+i);
			}
			
		}
	}

}
