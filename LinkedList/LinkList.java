package LinkedList;

import java.util.Scanner;

public class LinkList {
	
	int data;
	LinkList next;
	static Scanner sc=new Scanner(System.in);
	
	LinkList Accept() {
		LinkList start=null,temp=null,node=null;
		System.out.println("Enter how many elements you want to insert in linklist");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			node=new LinkList();
			System.out.println("Enter the data");
			node.data=sc.nextInt();
		if(start==null) {
			start=node;
		}
		else {
			temp=start;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
		}
		
	}
		return start;
}
	
	LinkList insert(LinkList start) {
		LinkList node=null,temp=null;
		System.out.println("Enter at which location you want to insert the data");
		int p=sc.nextInt();
		node=new LinkList();
		System.out.println("Enter the data");
		node.data=sc.nextInt();
		if(p==1) {
			node.next=start;
			display(node);
		}
		else {	
			temp = start;
			for(int i=1;i<=p-2;i++) {
				temp=temp.next;
			}
			node.next=temp.next;
			temp.next=node;
			node=start;
			//display(start);
		}
		return node;
	}
	void Delete(LinkList Start) {
		LinkList temp ,current=null;
		System.out.println("Enter the position you want to delete");
		int a=sc.nextInt();
		if(a==1 && Start!=null) {
			Start=Start.next;
			display(Start);
		}
		else {
			temp=Start;
			int count=1;
			while(count<a-1) {
				temp=temp.next;
				count++;
			}
			//System.out.println(temp.data);
			current=temp.next;
			temp.next=current.next;
			current.next=null;
			display(Start);
		}
	}
	
	
	
	void display(LinkList start) {
		LinkList node=start;
		while(node!=null) {
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList l1=new LinkList();
		LinkList s=l1.Accept();
		LinkList s1=l1.insert(s);
		l1.display(s1);
		l1.Delete(s1);
		//l1.reverse(s);
	}

}
