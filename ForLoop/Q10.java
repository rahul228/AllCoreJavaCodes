package ForLoop;
import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=1,i;
		for(i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0) 
				res=i;
			
		}
		System.out.println("The gcd of number is"+res);
		int res2=(a*b)/res;
		System.out.println("LCM of the number is"+res2);
	}

}
