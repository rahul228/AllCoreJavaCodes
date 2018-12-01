package Assignment2;
import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary of Employee:-");
		int a=sc.nextInt();
		if(a<=10000) {
			int gross=a+(a*20/100)+(a*80/100);
			System.out.println("Gross salary of employee is"+gross);
		}
		else if(a<=20000 && a>10000) {
			int gross=a+(a*25/100)+(a*90/100);
			System.out.println("Gross salary of employee is"+gross);
		}
		else if(a>20000) {
			int gross=a+(a*30/100)+(a*95/100);
			System.out.println("Gross salary of employee is"+gross);
		}
		else {
			System.out.println("You entered wrong amount");
		}
		
	}

}
