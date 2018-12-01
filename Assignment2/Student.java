package Assignment2;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of student");
		String s1=sc.nextLine();
		System.out.println("Enter the marks for physics");
		int a=sc.nextInt();
		System.out.println("Enter the marks for chemistry");
		int b=sc.nextInt();
		System.out.println("Enter the marks for mathematics");
		int c=sc.nextInt();
		System.out.println("Enter the marks for Biology");
		int d=sc.nextInt();
		System.out.println("Enter the marks for computer");
		int e=sc.nextInt();
		double f=(a+b+c+d+e)/5;
		System.out.println("THe student got percentage"+f);
		if(f>=90) {
			System.out.println("He has got grade A");
		}
		else if(f>=80 && f<90) {
			System.out.println("He has got grade B");
		}
		else if(f>=70 && f<80) {
			System.out.println("He has got grade C");
		}
		else if(f>=60 && f<70) {
			System.out.println("He has got grade D");
		}
		else if(f>=40 && f<60) {
			System.out.println("He has got grade E");
		}
		else {
			System.out.println("He has got grade F");
		}
		
		
	}

}
