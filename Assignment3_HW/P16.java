package Assignment3_HW;

public class P16 {
	public static void main(String[] args) {
		int a[][]={{22, 31, 9}, {12, 5, 16}, {34, 42, 2}};
		int b[][]=new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				b[i][j]=a[j][i];
				
				System.out.print(b[i][j]+" ");
			}System.out.println();
		}
		
		for(int i=0;i<b.length;i++) {
			int min=b[i][0];
			for(int j=0;j<b[i].length;j++) {
				if(min>b[i][j]) {
					min=b[i][j];
			System.out.println("The min is"+min);
				}
			}
		}
	}
}
