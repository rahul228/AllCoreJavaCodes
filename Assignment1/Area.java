package Assignment1;
import java.util.Scanner;
public class Area {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of rectangle:=");
		int a=sc.nextInt();
		System.out.print("Enter the breadth of rectangle:=");
		int b=sc.nextInt();
		int area=a*b;
		System.out.println("The area of Rectangle is:="+area);
		
	}

}
