package Assignment3_CW;

public class P20 {
	public static void main(String[] args) {
		int a[]= {2,4,3,5,6,7};
		int temp = 0;
		int size=a.length;
		for(int i=0;i<a.length;i++) {
			temp=a[size-1];
			size--;
			System.out.print(temp+" ");
		}
		
	}
}
