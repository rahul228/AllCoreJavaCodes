package Assignment2;

public class P1 {
	public static void main(String[] args) {
		int a[]= {20,0,31,45,100,1,105,90};
		int max=0,max1=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];	
			}
		}
		System.out.print("The entered array is:-");
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
			if(a[i]>max1 && a[i]<max) {
				max1=a[i];
			}
		}System.out.println("\nThe second largest element of the array is"+max1);
	}

}
