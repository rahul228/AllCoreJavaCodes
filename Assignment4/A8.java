package Assignment4;
import java.util.Scanner;
public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char you want to check");
		char ch=sc.next().charAt(0);
		if(ch>='A'&&ch<='Z') {
			System.out.println("Entered character is in uppercase");
		}
		else {
			System.out.println("Enter character is in lowercase");
		}
	}

}
