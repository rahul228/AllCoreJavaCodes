package Assignment2;
import java.util.Scanner;
public class Triangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first side of trianhle");
		int a=sc.nextInt();
		System.out.println("Enter the second side of trianhle");
		int b=sc.nextInt();
		System.out.println("Enter the third side of trianhle");
		int c=sc.nextInt();
		if(a+b>c && b+c>a && a+c>b) {
			System.out.println("valid traingle");
		}
		else {
			System.out.println("Invalid triangle");
		}
	}

}
