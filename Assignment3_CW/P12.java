package Assignment3_CW;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,12,9,25};
		System.out.println(max(a));
		System.out.println(min(a));

	}

	private static int max(int[] a) {
		// TODO Auto-generated method stub
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}

	private static int min(int[] a) {
		// TODO Auto-generated method stub
		int min=1000;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}

}
