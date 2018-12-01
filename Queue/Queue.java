 package Queue;

import java.util.Scanner;

public class Queue {
	
	int front=-1,rear=-1;
	static int a[]=new int[5];
	
	void insert(int d) {
		if(front==-1 && rear==-1) {
			front=0;
			rear=0;
			a[rear++]=d;
		}
		else {
			a[rear++]=d;
		}
	}
	
	int delete() {
		int d=-1;
		if((front==-1 && rear==-1)||(front>rear)){
			System.out.println("Queue is empty");
		}
		else {
			d=a[front++];
		}
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch;
		Queue q1=new Queue();
		do {
			System.out.println("ENter your choice\n1.Insert\n2.Delete\n3.Exit");
			int q=sc.nextInt();
			if(q==1) {
				System.out.println("Enter the data");
				int data=sc.nextInt();
				q1.insert(data);						
			}
			else if(q==2) {
				int d=q1.delete();
				System.out.println(d);
			}
			else {
				System.out.println("You entered wrong choice");
			}
			System.out.println("Do you want to continue\n1.Yes\n2.No");
			ch=sc.nextInt();
		}while(ch==1);
	}

}
