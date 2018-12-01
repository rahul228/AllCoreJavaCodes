package Array_Pratice;

public class Pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,-1,0,0,-2};
		int b[]=new int[a.length];
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				b[c]=a[i];
				c++;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				b[c]=a[i];
				c++;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				b[c]=a[i];
				c++;
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		

	}

}
