package Assignment;

public class P4 {
static int n1=0,n2=1,n3;
	static void fibonacci(int a) {
		
		if(a>0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" "+n3);
		fibonacci(a-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		System.out.print(n1+" "+n2+" ");
		fibonacci(a-2);
		
	}

}
