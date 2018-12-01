package Array_Pratice;

import java.util.Scanner;

public class Stack {
	static int top=-1;
	static int a[]=new int[5];
	void Push(int d) {
		
		if(top==a.length) {
			System.out.println("Stack Overflow");
		}
		else {
			a[++top]=d;
		}
	}
	
	static int Pop() {
		int d=0;
		if(top==-1) {
			System.out.println("Stack underflow");
		}
		else {
			d=a[top--];
		}
		return d;
	}
	
	static int Peap() {
		if(top!=-1) {
			System.out.println(a[top]);
		}
		
			return -1;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack q=new Stack();
		System.out.println("Enter the data you want to push");
		int a=sc.nextInt();
		
		
	}
}
