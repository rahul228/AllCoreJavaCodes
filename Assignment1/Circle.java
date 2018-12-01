package Assignment1;
import java.util.Scanner;
public class Circle {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int a=sc.nextInt();
		int diam=2*a;
		System.out.println("THe diameter of circle is"+diam);
		double circm=2*3.14*a;
		System.out.println("The circumference of circle is"+circm);
		double area=3.14*a*a;
		System.out.println("The area of circle is"+area);
		
	}

}
