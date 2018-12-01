package WhileLoop;
import java.util.Scanner;
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int a=sc.nextInt();
		int n=a;
		int c=a;
		int count=0,res=0;
		while(a>0) {
			count++;
			a=a/10;
		}
		while(n>0) {
			int r=n%10;
			res+=(int)(Math.pow(r, count));
			count--;
			n=n/10;
		}System.out.println(res);
		if(res==c) {
			System.out.println("The number is dssarian");
		}
		else {
			System.out.println("It is not");
		}
		
	}

}
