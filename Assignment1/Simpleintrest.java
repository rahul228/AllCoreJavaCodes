package Assignment1;
import java.util.Scanner;
public class Simpleintrest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle");
		int a=sc.nextInt();
		System.out.println("Enter the rate of intrest");
		double b=sc.nextInt();
		System.out.println("Enter the time");
		int c=sc.nextInt();
		double si=a*b*c/100;
		System.out.println("The simple intrest is\t"+si);
		
		
	}

}
