package Assignment2;
import java.util.Scanner;
public class Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int a=sc.nextInt();
		
		int b=a/2000;
		System.out.println("Total no. of 2000 notes are:-"+b);
		a=a%2000;
		
		int A1=a/500;
		System.out.println("Total no of 500 rs notes are:-"+A1);
		a=a%500;
		
		int A2=a/200;
		System.out.println("Total no of 200 rs notes are:-"+A2);
		a=a%200;
		
		int A3=a/100;
		System.out.println("Total no of 100 rs notes are:-"+A3);
		a=a%100;
		
		int A4=a/50;
		System.out.println("Total no of 50 rs notes are:-"+A4);
		a=a%50;
		
		int A5=a/20;
		System.out.println("Total no of 20 rs notes are:-"+A5);
		a=a%20;
		
		int A6=a/10;
		System.out.println("Total no of 10 rs notes are:-"+A6);
		a=a%10;
		
		int A7=a/5;
		System.out.println("Total no of 5 rs coins are:-"+A7);
		a=a%5;
		
		int A8=a/2;
		System.out.println("Total no of 2 rs coins are:-"+A8);
		a=a%2;
		
		int A9=a/500;
		System.out.println("Total no of 1 rs notes are:-"+A9);
		a=a%1;
	}

}
