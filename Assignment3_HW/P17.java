package Assignment3_HW;

public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5, 6, 23, 67, 39, 10, 2};
		int temp=0;
		for(int i=0;i<a.length-1;i++) {
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
		}System.out.println("The array after suffling is:-	");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
