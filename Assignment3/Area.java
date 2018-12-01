package AssignmentC;
import java.util.Scanner;
public class Area {
	static double area;
	
	static double Circle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int r=sc.nextInt();
		area=3.14*r*r;
		return area;
	}
	
	static double Square() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Side of square");
		int r=sc.nextInt();
		area=r*r;
		return area;
	}
	
	static double Rectangle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lenght of the rectangle");
		int l=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		int b=sc.nextInt();
		area=l*b;
		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area=Square();
		System.out.println("The area of square is"+area);
		area=Circle();
		System.out.println("The area of square is"+area);
		area=Rectangle();
		System.out.println("The area of square is"+area);
	}

}
