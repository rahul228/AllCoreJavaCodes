package NestedFor;
import java.util.Scanner;
public class Sequencehard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,fact=1;
		double d,res,t=0.0,q=0.0,s=0;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and n");
		int x=sc.nextInt();
		int n=sc.nextInt();
		for(int i=1;i<=n;i+=2) {
			d=Math.pow(x, i);
		for(int j=1;j<=i+1;j++) {
			fact=fact*j;
		}
		res=d/fact;
		fact=1;
		if(flag==true) {
			t=t+res;
			flag=false;
		}
		else {
			q=q+res;
			flag=true;
		}
		}
		s=t-q;
		System.out.println(s);
	}

}
