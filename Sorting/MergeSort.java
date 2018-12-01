package Sorting;

public class MergeSort {
	static int a[]= {2,3,1,5,6,4,8,7,9};
	static int temp[]=new int[a.length];
	static void partition(int s,int e) {
		int mid;
		if(s<e) {
			mid=(s+e)/2;
			partition(s,mid);
			partition(mid+1,e);
			Sort(s,mid,e);
		}
	}
	
	static void Sort(int s,int m,int e) {
		int i=s;
		int j=m+1;
		int k=s;
		while(i<=m&&j<=e) {
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
		while(j<=e) {
			temp[k++]=a[j++];
		}
		for(i=s;i<=e;i++) {
			a[i]=temp[i];
		}
	}
	
	static void display() {
		System.out.println("The sorted array is");
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int s=0;
		int e=a.length-1;
		partition(s,e);
		display();
		
	}
}
