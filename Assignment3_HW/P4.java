package Assignment3_HW;

import java.util.Arrays;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12, 22,32, 42, 52, 62};
		int b[]= {52, 22, 62, 12, 42, 21};
		int l=a.length-1;
		int count=0;
		if(a.length==b.length) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					count++;
				}
			}
		}if(count==6) {
			System.out.println("The arrays are same");
		}
		else {
			System.out.println("ARrays are different");
		}
		}
		else {
			System.out.println("Arrays are not same");
		}
	}

}
