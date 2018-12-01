package ForLoop;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b,temp=0,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int a=sc.nextInt();
		temp=a;
		for(int i=0; ; i++) {
			b=a%10;
			s=s+(b*b*b);
			a=a/10;
			if(a==0)
			break;
		}
		if(s==temp) {
			System.out.println("is a armstrong no");
		}
		else {
			System.out.println("Not");
		}
	}
}
		
