import java.util.Scanner;

public class Even {

	
	static int even(int b) {
		if(b==1) {
			return 2;
		}
		else {
			int res=2*b+even(b-1);
			return res;
		}
		
	}
	static int odd(int b) {
		if(b==1) {
			return b;
		}else {
			int res1=(2*b-1)+(odd(b-1));
			return res1;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		System.out.println(even(4));
		System.out.println(odd(4));
	}
	
}
