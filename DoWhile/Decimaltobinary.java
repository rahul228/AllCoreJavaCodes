package DoWhile;
import java.util.Scanner;
public class Decimaltobinary {
	public static void main(String arg[]) {
		int r,sum=1,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("What do you waant to do?");
		System.out.println("1.Decimal to Binary\n2.Binary to decimal");
		System.out.println("Enter your choice");
		int c=sc.nextInt();
		char ch;
		
		switch(c){
		
		case 1:
			System.out.println("Enter the number");
			int a=sc.nextInt();
			while(a>0) {
				sum=sum*10+(a%2);
				a=a/2;
			}
			a=0;
			while(sum>0) {
				a=a*10+(sum%10);
				sum/=10;
			}
			System.out.println("The decimal is:-"+a/10);
			break;
			
		case 2: System.out.println("Enter the binary number");
		int d=sc.nextInt();
		int res=0,p=0;
		do {
			res+=(d%10)*Math.pow(2, p);
			d=d/10;
			p++;
		}while(d!=0);
		System.out.println(res);
		}
		
	}

}
