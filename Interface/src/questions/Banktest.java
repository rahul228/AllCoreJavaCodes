package questions;
import java.util.Scanner;
public class Banktest extends Hdfc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Bank b=new Hdfc();
		System.out.println("Enter the amount you want to deposit\n");
		int c=sc.nextInt();
		b.deposit(c);
		System.out.println("Enter the amount you want to withdraw\n");
		int d=sc.nextInt();
		b.withdraw(d);
		System.out.println("The total balance in your account is\n");
		b.display();
		

	}

}
