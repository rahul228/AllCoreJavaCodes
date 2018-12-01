package Assignment2;
import java.util.Scanner;
public class Monthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month number");
		int a=sc.nextInt();
		if(a==1||a==3||a==5||a==7||a==8||a==10||a==12) {
			System.out.println("The month has 31 days");
		}
		else if(a==2) {
			System.out.println("The given month has 28 days");
		}
		else {
			System.out.println("The month has 30 days");
		}
	}

}
