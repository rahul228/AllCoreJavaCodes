package AssignmentC;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of customer");
		String n=sc.nextLine();
		System.out.println("Enter the address of customer");
		String add=sc.nextLine();
		System.out.println("Enter the amount of purchase");
		int a=sc.nextInt();
		System.out.println("Enter the type of purchase");
		char ch=sc.next().charAt(0);
		if(ch=='D'&& a<=25000) {
			double d=0.0;
			double net=a-(a*d/100);
			System.out.println("The customer:-"+n+"from"+add+" bought a Desktop worth rupees:-"+net);
		}
		else if(ch=='D'&& a>=25001 && a<=57000 ) {
			double d=5.0;
			double net=a-(a*d/100);
			System.out.println("The customer:-"+n+"from"+add+" bought a Desktop worth rupees:-"+net);
		}
		else if(ch=='D'&& a>=57001 && a<=100000 ) {
			double d=7.5;
			double net=a-(a*d/100);
			System.out.println("The customer:-"+n+"from"+add+" bought a Desktop worth rupees:-"+net);
		}
		else if(ch=='D'&& a>=100001) {
			double d=5.0;
			double net=a-(a*d/100);
			System.out.println("The customer:-"+n+"from"+add+" bought a Desktop worth rupees:-"+net);
		}
		if(ch=='L'&& a<=25000) {
			double d=5.0;
			double net=a-(a*d/100);
			System.out.println("The customer:-"+n+"from"+add+" bought a Desktop worth rupees:-"+net);
		}
		else if(ch=='L'&& a>=25001 && a<=57000 ) {
			double d=7.6;
			double net=a-(a*d/100);
			System.out.println("The customer:-"+n+"from"+add+" bought a Desktop worth rupees:-"+net);
		}
		else if(ch=='L'&& a>=57001 && a<=100000 ) {
			double d=10.0;
			double net=a-(a*d/100);
			System.out.println("The customer:-"+n+"from"+add+" bought a Desktop worth rupees:-"+net);
		}
		else if(ch=='L'&& a>=100001) {
			double d=15.0;
			double net=a-(a*d/100);
			System.out.println("The customer:-"+n+"from"+add+" bought a Desktop worth rupees:-"+net);
		}
		
		
	}

}
