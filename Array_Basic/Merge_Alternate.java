package Array_Pratice;

public class Merge_Alternate {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int b[]= {8,9,10,11,12,13,15};
		int c[]=new int[a.length+b.length];
		int k=0;
		for (int i = 0; i < a.length; i++) {
			c[k++]=a[i];
			c[k++]=b[i];
		}
		for(int i=k;i<c.length;i++) {
			c[k++]=b[i-a.length];
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		
	}
}
