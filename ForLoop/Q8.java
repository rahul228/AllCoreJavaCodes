package ForLoop;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base");
		int a=sc.nextInt();
		System.out.println("Enter the index");
		int b=sc.nextInt();
		int res=1;
		for(int i=1;i<=b;i++) {
			res=res*a;
		}
		System.out.println(res);
		
	}

}
