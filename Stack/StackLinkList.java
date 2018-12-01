package Stack;

import java.util.Scanner;

public class StackLinkList {

		StackLinkList prev;
		int data;
		static StackLinkList top;
		static Scanner sc=new Scanner(System.in);
		
		void  Push(int d) {
			StackLinkList n1 = new StackLinkList();
			n1.data=d;
			if(top==null) {
				top=n1;
			}
			else {
				n1.prev=top;
				top=n1;
			}
		
		}
		
		void pop() {
			if(top==null) {
				System.out.println("Empty");
			}
			else {
				System.out.println("Pop at"+top.data);
				top=top.prev;
			}
		}
		
		void peek() {
			while(top!=null) {
				System.out.println(top.data);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinkList s1=new StackLinkList();
		int ch;
		do {
			System.out.println("Enter your choice\n1.Push\n2.Pop");
			int a=sc.nextInt();
			if(a==1) {
				System.out.println("Enter the data");
				int b=sc.nextInt();
				s1.Push(b);
			}
			else if(a==2) {
				s1.pop();
			}
			System.out.println("DO you want to continue?\n1.Yes\n2.No");
			ch=sc.nextInt();
		}while(ch==1);
	}
	}


