package Assignment;

public class P3 {

	static int pow(int b,int i) {
		if(i==1) {
			return b;
		}
		else {
			int res=b*(pow(b,i-1));
			return res;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2,3));
	}

}
