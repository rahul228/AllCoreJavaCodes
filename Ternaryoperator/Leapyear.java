package Ternaryoperator;
import java.util.Scanner;
public class Leapyear {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int a=sc.nextInt();
		System.out.println(a%100==0?a%400==0?"Leap year":"Not":a%4==0?"Leap year":"Not");
	}

}
