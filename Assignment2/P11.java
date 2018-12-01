package Assignment2;

import java.util.Scanner;

public class P11 {
	
	static int max(int a[]) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	static int min(int a[]) {
		int min=1000;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int avg=0;
		System.out.println("Enter how many elements you want in your array");
		int a=sc.nextInt();
		int b[]=new int[a];
		System.out.println("Enter the elements you want in your array");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println("The array you entered is");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" "); 
		}
		int q=b.length-2;
		System.out.println("\nThe total elements in the array is"+q);
		/*int res1=min(b);
		System.out.println("\nThe minimum element for the array is"+res1);
		int res2=max(b);
		System.out.println("\nThe maximum element from the array is"+res2);*/
		for(int i=0;i<b.length;i++) {
			avg=avg+b[i]-(max(b)+min(b));
			
		}System.out.println("The total sum of the array is"+avg);
		double avg1=avg/q;
		System.out.println("the average is"+avg1);
		
		
	}

}
