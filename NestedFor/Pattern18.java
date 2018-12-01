package NestedFor;

public class Pattern18 {
	public static void main(String ar[]) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if((j==2||j==3||j==4)&&(i==2||i==3||i==4)) {
					System.out.print(" ");
					
				}
				else {
					System.out.print("*");
				}
			}System.out.println();
		}
	}
}
