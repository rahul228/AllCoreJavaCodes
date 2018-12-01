package Ternaryoperator;
import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		System.out.println("Enter the third number");
		int c=sc.nextInt();
		int max;
		System.out.println(max=a>b?a>c?a:c:b>c?b:c);
	}

}
