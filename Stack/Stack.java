package Stack;

import java.util.Scanner;

public class Stack {
	
	static int a[]=new int[5];
	int top=-1;
	void push(int d) {
		if(top==a.length-1) {
			System.out.println("Stack is full");
		}
		else {
			a[++top]=d;
		}
	}
	
	int Pop() {
		int d = -1;
		if(top==-1) {
			System.out.println("Stack is empty");
		}
		else {
			d=a[top--];
		}
		return d;
	}
	
	void Peep() {
		if(top!=-1) {
			System.out.println(a[top]);
		}
		else {
			System.out.println("Empty");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack s=new Stack();
		int c;
		do {
		System.out.println("Enter your choioce\n1.Push\n2.Pop\n3.Push\n4.Exit");
		int ch=sc.nextInt();
		if(ch==1) {
			System.out.println("ENter the data you want to push");
			int a=sc.nextInt();
			s.push(a);
		}
		else if(ch==2) {
			int b=s.Pop();
			System.out.println(b);
		}
		else if(ch==3) {
			s.Peep();
		}
		else {
			System.out.println("You have exited from program");
		}
		System.out.println("Do you wan to continue\n1.Yes\n2.No");
		c=sc.nextInt();
		}while(c==1);
		
	}

}
