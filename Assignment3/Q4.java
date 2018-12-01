package AssignmentC;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three digit number");
		long a=sc.nextLong();
		long b=a/100;
		long c=a%10;
		System.out.println("The first digit and last digit are:-"+b+c);
		long res=b+c;
		System.out.println("The result of the addition is:-"+res);
		if(res%2==0) {
			System.out.println("The result is even:-"+res);
		}
		else {
			System.out.println("The result is odd:-"+res);
		}
	}

}
