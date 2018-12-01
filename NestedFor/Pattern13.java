package NestedFor;

public class Pattern13 {
	public static void main(String ar[]) {
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=1;j--) {
				if(i+j<=6) {
					System.out.print(j);
				}
				else
					System.out.print(" ");
			}System.out.println();
		}
	}
}
