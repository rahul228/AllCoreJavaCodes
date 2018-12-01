package Assignment1;
import java.util.Scanner;
public class Perimeter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of rectangle:=");
		int a=sc.nextInt();
		System.out.print("Enter the breadth of rectangle:=");
		int b=sc.nextInt();
		int per=2*(a+b);
		System.out.print("Perimeter of Rectangle is"+per);
	}

}
