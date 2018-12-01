package questions;
import java.util.Scanner;
public class Hdfc implements Bank {
	static int total=10000;
	public void deposit(int x) {
		total=total+x;
		System.out.println("The total amount deposited is "+x+" And the toatal amount in your account is "+total);
		
	}
	
	public void withdraw(int y) {
		total=total-y;
		System.out.println("The total amount debited is "+y+" And the toatal amount in your account is "+total);
	}
	
	public void display() {
		System.out.println("The total amount in your account is "+total);	
	}
}
