package Assignment2;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first angle of the triangle");
		int a=sc.nextInt();
		System.out.println("Enter the second angle of the triangle");
		int b=sc.nextInt();
		System.out.println("Enter the third angle of the triangle");
		int c=sc.nextInt();
		if(a+b+c==180) {
			System.out.println("The triangle is valid");
		}
		else {
			System.out.println("The triangle is invalid");
		}
	}

}
