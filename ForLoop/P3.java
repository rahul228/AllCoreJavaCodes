package ForLoop;
import java.util.Scanner;
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev,b=4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer");
		int a=sc.nextInt();
		for(int i=1;i<b;i++) {
		rev=a%10;
		a=a/10;
		System.out.print(rev);
		
		}
	}

}
