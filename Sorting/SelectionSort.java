package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,1,4,0,5};
		int min,temp=0,i,j;
		for(i=0;i<a.length;i++) {
			min=i;
			for(j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}if(a[i]!=a[min]) {
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;
			}
		}
		System.out.println("Sorted array is");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
