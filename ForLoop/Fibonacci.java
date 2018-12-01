package ForLoop;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3=0;
		for(int i=0;i<=20;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
		}
		
	}

}
