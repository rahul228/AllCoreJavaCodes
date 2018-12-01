package Assignment2;

import java.util.Arrays;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12, 22,32, 42, 52, 62};
		int b[]= {52, 22, 62, 12, 42, 22};
		System.out.println("The entered arrays are");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
					
				}
		System.out.println("\n");
		for(int j=0;j<b.length;j++) {
			System.out.print(b[j]+" ");
			}
		if(Arrays.equals(a, b)) {
			System.out.println("\nThe entered array has same elements");
		}
		else {
			System.out.println("\nThey are different");
		}
	}

}
