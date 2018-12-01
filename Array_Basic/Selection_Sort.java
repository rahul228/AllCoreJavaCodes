package Array_Pratice;

public class Selection_Sort {
	public static void main(String[] args) {
		int a[]= {22,23,24,25,1,2,3,4};
		int temp,min,i,j;
		for(i=0;i<a.length;i++) {
			min=i;
			for(j=i+1;j<a.length;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}if(a[i]!=a[min]) {
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;
			}
		}
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
