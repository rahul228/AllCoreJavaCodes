package August_2;
import java.util.Scanner;
public class Bank {
	static String x;
	String Name;
	int id;
	static int y;
	
	Bank(){
		this(x,y);
		System.out.println("You are default constructors");
		
	}

	Bank(String x,int y){
	System.out.println("You are in 2 parameter constructor");	
		Name=x;
		id=y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name and id of customer");
		String a=sc.next();
		int b=sc.nextInt();
		Bank b1=new Bank();
	}

}
