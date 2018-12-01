package Sorting;

public class QuickSort {
	static int a[]= {2,3,1,4,5,7,6,9,8,0};
	static void partition(int s,int e) {
		int mid;
		if(s<e) {
			mid=Quick(s,e);;
			partition(s,mid-1);
			partition(mid+1,e);
			
		}
	}
	
	static int Quick(int start,int end) {
		int pindex=start;
		int pivot=a[end];
		int temp;
		for(int i=start;i<end;i++) {
			if(a[i]<=pivot) {
				temp=a[i];
				a[i]=a[pindex];
				a[pindex]=temp;
				pindex++;
			}
		}
		temp=a[pindex];
		a[pindex]=a[end];
		a[end]=temp;
		return pindex;
	}
	
	static void display() {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		int e=a.length-1;
		partition(s,e);
		display();
	}

}
