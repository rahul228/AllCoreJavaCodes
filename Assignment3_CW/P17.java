package Assignment3_CW;

public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int b[]= {7,8,9,10,11,12};
		int d=0;
		int c[]=new int[a.length+b.length];
		for(int i=0;i<c.length;i++) {
			if(d<=5) {
			c[i]=a[i];
			d++;
			}else {
				c[i]=b[i-b.length];
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}
}
