package Classwork_Sorting_Stack_Queue;

public class MergeSort {

	static int a[]= {8,6,4,500,1,153};
	
	static void Mergesort(int s,int end) {
		int mid;
		if(s<end) {
			mid=(s+end)/2;
			Mergesort(s,mid);
			Merge(s,mid,end);
			Mergesort(mid+1,end);
			Merge(s,mid,end);
			
		}
	}
	static void Merge(int start,int m,int end) {
		int i=start;
		int j=m+1;
		int k=start;
		int[] temp=new int[a.length];
		while(i<=m&&j<=end) {
			if(a[i]<a[j]) {
				temp[k++]=a[i++];
			}
			else {
				temp[k++]=a[j++];
			}
		}
		while(i<=m) {
			temp[k++]=a[i++];
		}
		while(j<=end) {
			temp[k++]=a[j++];
		}
		
		for(i=start;i<=end;i++) {
			a[i]=temp[i];
			//System.out.println(a[i]+" ");
		}
	}
	static void display()
	{
		for(int i:a)
			System.out.print(i+"\t");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=a.length-1;
		Mergesort(0,size);
		display();
	}

}
