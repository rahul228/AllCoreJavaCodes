package Assignment;

public class P7 {
	static int avg=0,sum=0;
	public static int average(int[] array) {
		int sum=0,avg = 0;
		for(int i=0;i<array.length;i++) {
				sum=sum+array[i];
			avg=sum/6;	
		}return avg;
		
	}
	
	public static double average(double[] array) {
		double sum=0;
		double avg = 0;
		for(int i=0;i<array.length;i++) {
				sum=sum+array[i];
			avg=sum/5;	
		}return avg;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		double b[]= {6.0,3.4,6.4,1.2,4.0};
		System.out.println(average(a));
		System.out.println(average(b));
	}

}
