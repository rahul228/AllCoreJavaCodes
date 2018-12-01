import java.util.Scanner;

public class Power {

	
	static int pow(int b,int i) {
		if(i==1) {
			return b;
		}
		else {
			int res=b*pow(b,i-1);
			return res;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base");
		int a=sc.nextInt();
		System.out.println("Enter the index");
		int b=sc.nextInt();
		System.out.println(pow(a,b));
		
		
	}
}
