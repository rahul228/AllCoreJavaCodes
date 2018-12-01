package AssignmentC;
import java.util.Scanner;
public class ElectronicsShop {
	double dicount,netamount;
	Scanner sc=new Scanner(System.in);
	void Laptop() {	
		System.out.println("Enter the amount upto which the customer want to purchase");
		int a=sc.nextInt();
		if(a<=25000) {
			System.out.println("The customer will not get any discount "+a);
		}
		else if(a>=25001 && a<=57000){
			System.out.println("The customer  will get a discount of 5%");
			netamount=a-(a*5/100);
			System.out.println("The customer has to pay Rs "+netamount);
		}
		else if(a>=57001 && a<=100000){
			System.out.println("The customer  will get a discount of 7.5%");
			netamount=a-(a*7.5/100);
			System.out.println("The customer has to pay Rs "+netamount);
		}
		else if(a>=100000){
			System.out.println("The customer  will get a discount of 10%");
			netamount=a-(a*10/100);
			System.out.println("The customer has to pay Rs "+netamount);
		}
	}
	void Desktop() {
		
		System.out.println("Enter the amount upto which the customer want to purchase");
		int a=sc.nextInt();
		if(a<=25000) {
			System.out.println("The customer  will get a discount of 5%");
			netamount=a-(a*5/100);
			System.out.println("The customer has to pay Rs "+netamount);
		}
		else if(a>=25001 && a<=57000){
			System.out.println("The customer  will get a discount of 7.6%");
			netamount=a-(a*7.6/100);
			System.out.println("The customer has to pay Rs "+netamount);
			}
		else if(a>=57001 && a<=100000){
			System.out.println("The customer  will get a discount of 10%");
			netamount=a-(a*10/100);
			System.out.println("The customer has to pay Rs "+netamount);
		}
		else if(a>100000){
			System.out.println("The customer  will get a discount of 15.0%");
			netamount=a-(a*15.0/100);
			System.out.println("The customer has to pay Rs "+netamount);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of customer");
		String str=sc.nextLine();
		System.out.println("Enter the address of of customer");
		String addr=sc.nextLine();
		System.out.println("Enter what does the customer want to purchase");
		char type=sc.next().charAt(0);
		ElectronicsShop b1=new ElectronicsShop();
		if(type=='L') {
			b1.Laptop();
		}
		else {
			b1.Desktop();
		}
	}

}
