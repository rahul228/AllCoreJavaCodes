package Assignment1;
import java.util.Scanner;
public class Equilateral {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sides of equilateral traingle");
		int a=sc.nextInt();
		double area=0.433*a*a;
		System.out.println("THe area of triangle is"+area);
	}

}
