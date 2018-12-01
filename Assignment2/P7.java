package Assignment2;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12, 23, 34, 67 ,78, 91, 56};
		int b[] = {39, 25, 15, 23, 55, 91,66, 22};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(b[j]);
				}
			}
		}
	}

}
