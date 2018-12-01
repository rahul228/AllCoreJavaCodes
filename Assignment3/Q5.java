package AssignmentC;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the serial number");
		int a=sc.nextInt();
		System.out.println("Enter Name of customer");
		String ab=sc.next();
		System.out.println("Enter the amount of ticket");
		int amt=sc.nextInt();
		System.out.println("SL.NO.\t\tName\t\tTicket Charges\t\tDiscount\t\tNet Amount\n" );
		if(amt>70000) {
			int g=18;
			long res=amt-(amt*g/100);
			System.out.println(+ a +"\t\t"+ ab +"\t\t"+ amt +"\t\t\t"+ g +"\t\t\t"+ res);
		}
		else if(amt>=55001 && amt<70000) {
			int g=16;
			long res=amt-(amt*g/100);
			System.out.println(+ a +"\t\t"+ ab +"\t\t"+ amt +"\t\t\t"+ g +"\t\t\t"+ res);
		}
		else if(amt>=35001 && amt<55001) {
			int g=12;
			long res=amt-(amt*g/100);
			System.out.println(+ a +"\t\t"+ ab +"\t\t"+ amt +"\t\t\t"+ g +"\t\t\t"+ res);
		}
		else if(amt>=25001 && amt<35000) {
			int g=10;
			long res=amt-(amt*g/100);
			System.out.println(+ a +"\t\t"+ ab +"\t\t"+ amt +"\t\t\t"+ g +"\t\t\t"+ res);
		}
		else if(amt<25001) {
			int g=2;
			long res=amt-(amt*g/100);
			System.out.println(+ a +"\t\t"+ ab +"\t\t"+ amt +"\t\t\t"+ g +"\t\t\t"+ res);
		}
	}
	
}
