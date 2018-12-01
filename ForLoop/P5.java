package ForLoop;
import java.util.Scanner;
public class P5 {
	public static void main(String ar[]) {
		System.out.println("Enter the number till you want");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0,sum1=0,e=2;
		for(int i=1;i<=a;i++) {
			if(i%2==1) 
				sum=sum+e;
				else 
				sum=sum-e;
				e+=2;
			}
		System.out.println(sum);
		
	}

}
