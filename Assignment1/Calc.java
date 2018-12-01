package Assignment1;
import java.util.Scanner;
public class Calc {
	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers\n");
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("\n1.ADD\n2.SUB\n3.MUL\n4.DIV\n5.EXIT");
		int d=sc.nextInt();
		if(d==1) {
			int e=b+c;
			System.out.println("Addition is"+e);
			
		}
		else if(d==2) {
			int f=b-c;
			System.out.println("Subtraction is"+f);

		}
		else if(d==3) {
			int g=b*c;
			System.out.println("Multiplication is"+g);

		}
		else if(d==4) {
			
			int h=b/c;
			System.out.println("Division is"+h);
		}
		else {
			System.out.println("Exit");
		}
			
		
		
				
	}
		
}
