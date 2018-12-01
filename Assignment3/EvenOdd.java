package AssignmentC;
import java.util.Scanner;
public class EvenOdd {

	static boolean evenodd(int x) {
		if(x%2==0)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		boolean b=evenodd(a);
		if(b==true) {
			System.out.println("The number you entered is even");
		}
		else {
			System.out.println("The number you entered is odd");
		}
	}

}
