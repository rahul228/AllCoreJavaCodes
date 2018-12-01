package Assignment1;
import java.util.Scanner;
public class Compoundintrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle amount");
		int p=sc.nextInt();
		System.out.println("Enter the rate of intrest");
		int r=sc.nextInt();
		System.out.println("Enter the time in years");
		double t=sc.nextInt();
		double a=1+r/2;
		double nt=2*t;
		double CI=Math.pow(a, nt);
		System.out.println("The compound intrest is"+CI);
		
	}

}
