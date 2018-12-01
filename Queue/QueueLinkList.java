package Queue;

import java.util.Scanner;

public class QueueLinkList {
	int data;
	QueueLinkList start,next;
	static Scanner sc=new Scanner(System.in);	
	void Queue(int d) {
		QueueLinkList temp=null,q;
		q=new QueueLinkList();
		q.data=d;
		if(start==null) {
			start=q;
		}
		else {
			temp=start;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=q;
		}
}
	
	void  Dequeue() {
		
		if(start==null) {
			System.out.println("Queue is empty");
		}
		else {
			System.out.println(start.data+" ");
			start=start.next;	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinkList s=new QueueLinkList();
		QueueLinkList s1 = null;
		int ch;
		do {
			System.out.println("Enter your choice\n1.Queue\n2.Dequeue");
			int p=sc.nextInt();
			if(p==1) {
				System.out.println("Enter the data you want to insert into queue");
				int d=sc.nextInt();
				s.Queue(d);
			}
			else if(p==2) {
				s.Dequeue();		
			}
				System.out.println("Do you want to continue?\n1.Yes\n2.No");
				ch=sc.nextInt();				
		}while(ch==1);
		
	}

}
