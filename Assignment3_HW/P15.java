package Assignment3_HW;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{22, 31, 9}, {12, 25, 16}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		for(int i=0;i<a.length;i++) {
			int max=a[i][0];
			for(int j=0;j<a.length;j++ ) {
				if(max<a[i][j]) {
					max=a[i][j];
					System.out.println("THe max is"+max);	
				}
			}
		}

	}

}
