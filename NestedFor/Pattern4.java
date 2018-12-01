package NestedFor;

public class Pattern4 {
	public static void main(String ar[]) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
