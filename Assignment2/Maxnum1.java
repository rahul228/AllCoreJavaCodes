package Assignment2;
import java.util.Scanner;
public class Maxnum1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:-");
		int a=sc.nextInt();
		System.out.println("Enter the second number:=");
		int b= sc.nextInt();
		System.out.println("Enter the third number:=");
		int c= sc.nextInt();
		if(a>b && a>c) {
			System.out.println("The number which is bigger is:-"+a);
		}
		else if(b>a && b>c) {
			System.out.println("The number which is bigger is:-"+b);
		}
		else {
			System.out.println("The bigger number is:-"+c);
		}
	}

}
