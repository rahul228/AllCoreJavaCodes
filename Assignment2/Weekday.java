package Assignment2;
import java.util.Scanner;
public class Weekday {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		if(a==1) {
			System.out.println("It is monday");
		}
		else if(a==2) {
			System.out.println("it is tuesday");
		}
		else if(a==3) {
			System.out.println("it is wednesday");
		}
		else if(a==4) {
			System.out.println("it is thursday");
		}
		else if(a==5) {
			System.out.println("it is friday");
		}
		else if(a==6) {
			System.out.println("it is saturday");
		}
		else {
			System.out.println("it is sunday");
		}
	}

}
