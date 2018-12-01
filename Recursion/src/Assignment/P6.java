package Assignment;
import java.util.Scanner;
public class P6 {

	
	void printno(int x,int y) {
		if(x<=y) {
			System.out.println(x);
			printno(x+1,y);
		}
		}
		
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int a=sc.nextInt();
		System.out.println("Enter the value of y");
		int b=sc.nextInt();
		int z=a+b;
		P6 o=new P6();
		o.printno(a, z);
	}

}
