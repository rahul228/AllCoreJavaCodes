package DoWhile;
import java.util.Scanner;
public class Binarytodecimal {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number");
		int a=sc.nextInt();
		int res=0,p=0;
		do {
			res+=(a%10)*Math.pow(2, p);
			a=a/10;
			p++;
		}while(a!=0);
		System.out.println(res);
	}
}
