package WhileLoop;
import java.util.Scanner;
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int fact=1,res=0,temp=0,b;
		temp=a;
		while(a>0)
		{
		b=a%10;
		for(int i=1;i<=b;i++) {
			fact=fact*i;
		}
		res=res+fact;
		a=a/10;
		fact=1;
		}
		if(temp==res) {
			System.out.println("The number is krishnamurthy");
		}
		else {
			System.out.println("It is not");
		}
	}

}
