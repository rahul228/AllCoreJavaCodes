package WhileLoop;
import java.util.Scanner;
public class P9 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int count=0,r,b;
		r=a;
		while(a>0) {
			b=a%10;
			count=count*10+b;
			a=a/10;
		}
		if(count==r) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("Not");
		}
	}

}
