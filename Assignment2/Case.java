package Assignment2;
import java.util.Scanner;
public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		if(ch>=65 && ch<=91) {
			System.out.println("The given char is in uppercase");
		}
		else {
			System.out.println("The char is in lowercase");
		}
	}

}
