package Array_Pratice;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,11,2,13,18,15};
		int b,j;
		for(int i=1;i<a.length;i++) {
			b=a[i];
			for(j=i-1;j>=0&&b<a[j];j--) {
				a[j+1]=a[j];
			}
			a[j+1]=b;			
		}
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
		}

	}

}
