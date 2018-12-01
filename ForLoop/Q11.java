package ForLoop;
import java.util.Scanner;
public class Q11 {
	public static void main(String arg[]) {
		int fact=1;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int a=sc.nextInt();
		System.out.println("All factorials from one to given number is:-");
		for(int i=1;i<=a;i++) {
			fact=fact*i;
			sum=sum+fact;
			System.out.println(fact);
			
		}System.out.println("The sum of all factorials upto given number is:-"+sum);
		
		
	}

}
