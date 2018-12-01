package Assignment2;
import java.util.Scanner;
public class Triangle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first side of trianhle");
		int a=sc.nextInt();
		System.out.println("Enter the second side of trianhle");
		int b=sc.nextInt();
		System.out.println("Enter the third side of trianhle");
		int c=sc.nextInt();
		if(a==b && a==c && b==c) {
			System.out.println("THe given triangle is equilateral");
		}
		else if(a==b&&b!=c || b==c&&c!=a || a==c && c!=b) {
			System.out.println("Isosceles triangle");
		}
		else {
			System.out.println("scalene triangle");
		}
	}
	

}
