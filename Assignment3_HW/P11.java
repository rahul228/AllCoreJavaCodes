package Assignment3_HW;

public class P11 {
	public static void main(String[] args) {
	int a[]= {3, 43, 25, 49, 12, 9, 78,66, 39};
	for(int i=0;i<a.length;i++) {
		int y=(int) Math.sqrt(a[i]);
		int z=y*y;
		if(a[i]==z) {
			System.out.print(a[i]+" ");
		}
	}
}
}
