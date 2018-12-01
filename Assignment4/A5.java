package Assignment4;
import java.util.Scanner;
public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lenght of rectangle");
		int a=sc.nextInt();
		System.out.println("Enter the breadth of rectangle");
		int b=sc.nextInt();
		if(a==b)
		{
			System.out.println("It is not a rectangle and is a square");
		}
		else {
			System.out.println("It is rectangle");
		}
	}

}
