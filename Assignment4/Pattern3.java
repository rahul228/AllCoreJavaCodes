package Assignment4;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,sp=9;
		for(i=1;i<=9;i++) {
			for(j=1;j<sp;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(" *");
			}System.out.println();
			sp--;
		}

	}

}
