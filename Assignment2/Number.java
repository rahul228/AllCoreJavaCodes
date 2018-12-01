package Assignment2;
import java.util.Scanner;
public class Number {
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int b= sc.nextInt();
	if(b>0) {
		System.out.println("The number is positive");
		}
	else if(b<0) {
		System.out.println("The Number is negative");
	}
	else {
		System.out.println("THe number is zero");
	}
	
			
}

}
