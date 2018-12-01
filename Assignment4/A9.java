package Assignment4;
import java.util.Scanner;
public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b,res=0 ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer you want to convert");
		int a=sc.nextInt();
		while(a>0) {
			b=a%10;
			res=res*10+b;
			a=a/10;
		}System.out.println(res);
	}

}
