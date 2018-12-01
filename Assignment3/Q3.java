package AssignmentC;

import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:=");
	int a=sc.nextInt();
	System.out.println("THe two numbers are:="+a);
	if(a>=10 && a<=99) {
	int b=a%10;
	int c=a/10;
	int d=b+c;
	int e=b*c;
	if(d+e==a)
	{
		System.out.println("The number is a special number");
	}
	else
	{
		System.out.println("It is a simple number");
	}
}
	}
}
