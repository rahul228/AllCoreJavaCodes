package Assignment3_HW;

public class P3 {
	public static void main(String[] args) {
		int a[]= {2,4,3,5,6,7};
		int c[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(c[i]+" ");
		}
	}
}
