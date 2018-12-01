package WhileLoop;
import java.util.Scanner;
public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int n=a;
		int count=0;
		int c=a*a;
		int temp=a;
		
		while(a>0) {
			count++;
			a=a/10;
		}
		int res=(int)(Math.pow(10, count));
		if(c%res==temp) {
			System.out.println("It is automorphic");
		}
		else {
			System.out.println("Not");
		}
	}

}
