package WhileLoop;
import java.util.Scanner;
public class Neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0,sum=0,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int sq=a*a;
		while(sq>0) {
			res=sq%10;
			sum=sum+res;
			sq=sq/10;
		}
		if(sum==a) {
			System.out.println("Neon");
		}
		else {
			System.out.println("Not");
		}
		
	}

}
