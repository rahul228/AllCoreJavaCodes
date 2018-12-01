package Assignment1;
import java.util.Scanner;
public class Student1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks for first subject:=");
		int a=sc.nextInt();
		System.out.println("Enter the marks for second subject:=");
		int b=sc.nextInt();
		System.out.println("Enter the marks for third subject:=");
		int c=sc.nextInt();
		System.out.println("Enter the marks for fourth subject:=");
		int d=sc.nextInt();
		System.out.println("Enter the marks for fifth subject:=");
		int e=sc.nextInt();
		int tot=a+b+c+d+e;
		System.out.println("The total of five subjects is"+tot);
		double avg=(a+b+c+d+e)/5;
		System.out.println("The average of five subjects is"+avg);
		double per=(tot*100)/500;
		System.out.println("The percentage of students is:="+per);
		
		
		
	}

}
