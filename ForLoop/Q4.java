package ForLoop;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
			}
		System.out.println("The fact of number is"+fact);
			
		}
	}


