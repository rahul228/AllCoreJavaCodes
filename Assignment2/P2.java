package Assignment2;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= { -20, 0, -25, 15, 19, 37, 23};
		int min=0,min1=0;
		for (int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]<min1 && a[i]>min) {
				min1=a[i];
			}
		}System.out.println("The second minimum elemet of the array is"+min1);
	}

}
