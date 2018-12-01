
public class Multiples {

	static int multiples(int a,int b) {
		if(b==1) {
			return a;
		}
		else {
			int mul= a*b+multiples(a,b-1);
			return mul;
		}
	}
	public static void main(String[] args) {
		System.out.println(multiples(3,10));
	}
}
