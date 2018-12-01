package WhileLoop;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int sum=0,b,i=1;
		while(i>0) {
			b=a%10;
			sum=sum+b;
			a=a/10;
			i++;
		}
		System.out.println(sum);
		
		
	}

}
