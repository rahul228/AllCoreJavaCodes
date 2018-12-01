package Assignment3_CW;

public class P8 {

	public static int Average1(int a[]) {
		int sum=0,avg;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}avg=sum/a.length;
		return avg;
	}
	public static double Average(double a[]) {
		double sum=0,avg;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}avg=sum/a.length;
		return avg;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,6,7,8};
		double b[]= {2.0,3.0,4.5,8.9};
		System.out.println(Average1(a));
		System.out.println(Average(b));

	}

}
