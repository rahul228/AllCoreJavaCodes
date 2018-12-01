package Assignment3_CW;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,6,7,8,9,10,11,12};
		int b[]=new int[10];
		int c[]=new int[10];
		int l=0,m=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				b[l]=a[i];
				l++;
			}
			else {
				c[m]=a[i];
				m++;
			}
			
		}
		System.out.println("even elements are");
		for(int i=0;i<l;i++) {
			System.out.print(b[i]+" ");
		}System.out.println("\nodd elements are");
		for(int i=0;i<m;i++) {
			System.out.print(c[i]+" ");
		}
		
	}

}
