package Assignment1;
import java.util.Scanner;
public class P7 {
	int accnum;
	String type;
	float amount;
	static Scanner sc=new Scanner(System.in);
	void insert() {
		System.out.println("Enter the account number");
		accnum=sc.nextInt();
		System.out.println("Enter the account type");
		type=sc.next();
		System.out.println("Enter the amount");
		amount=sc.nextFloat();
	}
	
	void display() {
		System.out.println(accnum);
		System.out.println(type);
		System.out.println(amount);
	}
	
	void Deposit() {
		System.out.println("Enter the amount you want to deposit");
		float a=sc.nextFloat();
		amount=amount+a;
		System.out.println("The amount after deposit is"+amount);
	}
	
	void Withdraw() {
		System.out.println("Enter the amount you want to withdraw");
		int b=sc.nextInt();
		amount=amount-b;
		
	}
	void displaybalance() {
		System.out.println("The total balance is"+amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P7 p1=new P7();
		p1.insert();
		p1.display();
		p1.Deposit();
		p1.Withdraw();
		p1.displaybalance();
	}

}
