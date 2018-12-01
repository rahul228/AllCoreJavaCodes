package Assignment4;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,sp=1,m;
		for(i=9;i>=1;i--) {
			for(j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(k);
			}
			for(m=i-1;m>=1;m--) {
				System.out.print(m);
			}System.out.println();
			sp++;
		}

	}

}
