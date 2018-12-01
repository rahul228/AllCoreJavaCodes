package Searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
	int a[]= {2,3,4,5,6,7,8};
	int start=0;
	int mid;
	int end=a.length-1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element you want to search");
	int d=sc.nextInt();
	boolean flag=false;		
	while(start<=end) {
		mid=(start+end)/2;
		if(a[mid]==d) {
			System.out.println("found");
			flag=true;
			break;
		}
		else if(d>a[mid]) {
			start=mid+1;			
		}
		else {
			end=mid-1;
		}
	}
	if(flag==false) {
		System.out.println("Not found");
	}
	
	}

}
