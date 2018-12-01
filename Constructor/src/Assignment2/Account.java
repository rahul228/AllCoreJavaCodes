package Assignment2;
import java.util.Scanner;
public class Account {
	public long acc_num;
	public String Customer_Name;
	
	
	Account(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the acc number");
		acc_num=sc.nextLong();
		System.out.println("Enter the Customer_name");
		Customer_Name=sc.next();
		System.out.println("Now i am in default constructor");
	}
	
	Account(long x,String y){
		acc_num=x;
		Customer_Name=y;
		System.out.println("I am in parametarized constructor");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Account a=new Account();
		System.out.println(a.acc_num);
		System.out.println(a.Customer_Name);
		Account a1=new Account();
		System.out.println(a1.acc_num);
		System.out.println(a1.Customer_Name);*/
		
		Account a=new Account(12345678,"qwertyuio");
		System.out.println(a.acc_num);
		System.out.println(a.Customer_Name);
	}

}
