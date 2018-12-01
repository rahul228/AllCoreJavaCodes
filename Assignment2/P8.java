package Assignment2;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,9,0};
		int temp;
		System.out.println("The given array is");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length/2;i++) {
			
			temp=a[i];
			a[i]=a[i+2];
			a[i+2]=temp;
		}System.out.println("\nThe sorted arrays are");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
