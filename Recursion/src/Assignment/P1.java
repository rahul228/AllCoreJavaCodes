package Assignment;

public class P1 {

	static int sum(int n) {
		int total=0;
		if(n==1) {
			return 1;
		}
		else {
			total=n+total+(sum(n-1));
			return total;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(100));
	}

}
