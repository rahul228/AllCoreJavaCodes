package Classwork_Sorting_Stack_Queue;

import java.util.Scanner;

public class Stack {
	int a[]= new int[5];
	int top=-1;
	
	 void push(int d) {
		
		if(top<a.length-1) {
			a[++top]=d;
		}else {
			System.out.println("Stack overflow");
		
		}
	}
	
	int pop() {
		int d=-1,q;
		if(top==-1){
			System.out.println("No element in your stack");
		}
		else {
			d=a[top--];
		}
		return d;
	}
	
	int peep() {
		if(top!=-1) {
			return a[top];
		}else {
			return -1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack p1=new Stack();
		char q;
		
		do {
			System.out.println("1.Push\n2.Pop\n3.Peek");
			Scanner sc=new Scanner(System.in);
			int b=sc.nextInt();
		if(b==1) {
			System.out.println("Enter the element");
			int t=sc.nextInt();
			p1.push(t);
		}
		else if(b==2) {
			int e=p1.pop(); 
			
			System.out.println(e);
		}
		else if(b==3) {
			System.out.println("The top of stack is");
			int e=p1.peep();
			System.out.println(e);
		}
		else {
			break;
		}
		System.out.println("Do you want to continue a=yes/b=no");
		q=sc.next().charAt(0);
		}while(q=='a');

	}

}
