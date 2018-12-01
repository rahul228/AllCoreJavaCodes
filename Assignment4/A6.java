package Assignment4;
import java.util.Scanner;
public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of first guy");
		int a=sc.nextInt();
		System.out.println("Enter the age of Second guy");
		int b=sc.nextInt();
		System.out.println("Enter the age of Third guy");
		int c=sc.nextInt();
		max=((a>b)?(a>c)?a:c:(b>c)?b:c);
		System.out.println(max);
		}
	}


