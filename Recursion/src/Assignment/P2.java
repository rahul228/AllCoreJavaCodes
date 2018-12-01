package Assignment;

public class P2 {

	
	static int fact(int n) {
		int f=1;
		if(n==1) {
			return 1;
		}
		else {
			f=f*n*(fact(n-1));
			return f;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
	}

}
