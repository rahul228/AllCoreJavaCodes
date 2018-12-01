package Assignment2;
import java.util.Scanner;
public class Divisibilitytest {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int a=sc.nextInt();
		double b=a%5;
		double c=a%11;
		if(b==0 && c==0) {
			System.out.println("The number is divisible");
		}
		else {
			System.out.println("The number is not divisible");
		}
	}

}
