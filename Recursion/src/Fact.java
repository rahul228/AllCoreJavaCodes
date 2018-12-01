
public class Fact {

	static int fact(int a) {
		int f=a;
		if(a==1) {
			return a;
		}
		else {
		f=f*fact(a-1);
		return f;
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println(fact(4));
	}
}
