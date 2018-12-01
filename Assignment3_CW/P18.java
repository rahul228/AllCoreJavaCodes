package Assignment3_CW;

public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,5,4};
		int temp;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
			if(a[j]>a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}
			}
		}
		System.out.println("Sorted array is");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
