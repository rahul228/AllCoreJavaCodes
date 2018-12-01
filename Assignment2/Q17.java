package Assignment2;
import java.util.Scanner;
public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("The quadratic equation is ax^2+bx+c");
		System.out.println("Enter the value of a");
		double a=sc.nextDouble();
		System.out.println("Enter the value of b");
		double b=sc.nextDouble();
		System.out.println("Enter the value of c");
		double c=sc.nextDouble();
		double res=b*b-4*a*c;
		
		if(res>0) {
			System.out.println("Roots are real and unequal");
			double d=-b+Math.sqrt(res);
			double f=d/2*a;
			double g=-b-Math.sqrt(res);
			double h=g/2*a;
			System.out.println("first root is"+f);
			System.out.println("Second root is"+h);
		}
		else if(res==0) {
			System.out.println("Root are real and equal");
			double d=-b/2*a;
			System.out.println("roots are"+d);
		}
		else {
			System.out.println("Roots are imaginary");
		}
	}

}
