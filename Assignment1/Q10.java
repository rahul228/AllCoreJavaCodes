package Assignment1;
import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and power of a number");
		double a=sc.nextInt();
		double b=sc.nextInt();
		double res=Math.pow(a, b);
		System.out.println("The result is:-"+res);
;
	}

}
