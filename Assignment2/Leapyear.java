package Assignment2;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("ENter the year you want to check:-");
		int a=sc.nextInt();
		if(a%4==0) {
			if(a%100==0) {
				if(a%400==0)
				System.out.println("The given year is leap year");
				else
					System.out.println("THe given year is not leap year");
			}
			else {
				System.out.println("is leap");
			}
		}
		else {
			System.out.println("The yaer is not a leap year");
		}

	}

}
