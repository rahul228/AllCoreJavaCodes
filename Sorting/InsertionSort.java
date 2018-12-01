package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,1,4,6,8,0,5};
		int i,j;
		for (i = 0; i < a.length; i++) {
			int d=a[i];
			for(j=i-1;j>=0&&d<a[j];j--) {
				a[j+1]=a[j];
			}
			a[j+1]=d;
		}
		for ( i= 0; i < a.length; i++) {
			System.out.print(a[i]+" ");	
		}
		

	}

}
