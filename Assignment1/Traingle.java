package Assignment1;
import java.util.Scanner;
public class Traingle {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first angle of a triangle");
		int a=sc.nextInt();
		System.out.println("Enter the second angle of a triangle");
		int b=sc.nextInt();
		int c=180-a-b;
		System.out.println("The third angle of triangle is:="+c);
	}

}
