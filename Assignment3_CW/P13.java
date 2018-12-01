package Assignment3_CW;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,2,3,4,5,3,4,5};
		int c=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					c++;
				}
			}
		}System.out.println("The total number of duplicate elements are "+c);
	}

}
