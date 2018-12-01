package WhileLoop;
import java.util.Scanner;
public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b,count=0;
		int c=a;
		int res=0;
		int temp=a;
		while(a>0) {
			count++;
			a=a/10;
		}
		while(c>0) {
		int d=c%10;
		res=res+(int)(Math.pow(d, count));
		c=c/10;
		count--;
		}
		if(res==temp) {
			System.out.println("Dessarian");
		}
		else {
			System.out.println("Not ");
		}
		
		
	}

}
