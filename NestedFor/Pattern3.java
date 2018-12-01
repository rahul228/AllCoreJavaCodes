package NestedFor;

public class Pattern3 {

	public static void main(String[] args) {
		int i,j,k,l;
		// TODO Auto-generated method stub
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(k=4;k>=1;k--) {
			for(l=1;l<=k;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
