package Queue;

public class CircularQueue {
	
	int front=-1,rear=-1;
	int a[]=new int[5];
	int size=a.length;
	void insert(int d) {
		
		if((front ==0 && rear==0)||rear+1==front) {
			System.out.println("Queue full");
		}
		else {
			if(rear==a.length-1) {
				rear=0;
			}
			else {
				rear=(rear+1)%size;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
