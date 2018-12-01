package Array_Pratice;

public class Merge_arrays {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int b[]= {11,12,1,14,14};
		int c[]=new int[a.length+b.length];
		int d=0;
		for (int i = 0; i < a.length; i++) {
			c[d]=a[i];
			d++;
		}
		for(int i=0;i<b.length;i++) {
			c[d]=b[i];
			d++;			
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}
}
