package Assignment2;
import java.util.Scanner;
public class Maxnum {
	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:=");
		int b=sc.nextInt();
		System.out.println("Enter the Second number:=");
		int c= sc.nextInt();
		if(b>c) {
			System.out.println("The bigger number is:-"+b);
		}
		else {
			System.out.println("The bigger number is:-"+c);
		}
		
	}
			

}
