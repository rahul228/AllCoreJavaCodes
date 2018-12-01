package WhileLoop;
import java.util.Scanner;
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=0,c1=0,c2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of your choice");
		int a=sc.nextInt();
		while(a>0) {
			res=a%10;
		if(res%2==0) {
			c1++;
			a=a/10;
		}
		else {
		c2++;
		a=a/10;
		}
	
	}
		System.out.println("Total no of even digits are:-"+c1);
		System.out.println("Total number of odd digits are:-"+c2);

	}
}
