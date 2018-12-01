package Assignment4;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,m,sp=9;
		for(i=9;i>=1;i--) {
			for(j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(k=i;k<=9;k++) {
				System.out.print(k);
			}
			for(m=8;m>=i;m--) {
				System.out.print(m);
			}System.out.println();
			sp--;
		}
	}

}
