package Assignment1;
import java.util.Scanner;
public class Calender {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of days:=");
		int days=sc.nextInt();
		System.out.println("No. of months are:="+days/30);
		System.out.println("No. of weeks are:="+days/7);
		System.out.println("No. of years are:="+days/365);
		
	}

}
