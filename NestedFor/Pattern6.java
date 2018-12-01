package NestedFor;

public class Pattern6 {
	public static void main(String ar[]) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
