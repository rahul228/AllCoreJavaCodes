package Assignment1;
import java.util.Scanner;
public class Areat {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base of traingle");
		int a =sc.nextInt();
		System.out.println("Enter the height of traingle");
		int b =sc.nextInt();
		double area=0.5*a*b;
		System.out.println("The area of rectangle is"+area);
		
	}

}
