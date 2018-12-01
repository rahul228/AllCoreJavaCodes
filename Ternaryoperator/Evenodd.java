package Ternaryoperator;
import java.util.Scanner;
public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int a=sc.nextInt();
		System.out.println(a%2==0?"Even":"Odd");
	}

}
