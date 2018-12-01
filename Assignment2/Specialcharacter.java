package Assignment2;
import java.util.Scanner;
public class Specialcharacter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		char ch=sc.next().charAt(0);
		if(ch>=65 && ch<=91 || ch>=96 && ch<=122) {
			System.out.println("It is alphabet");
		}
		else if(ch>=48 && ch<57) {
			System.out.println("it is digit");
		}
		else {
			System.out.println("it is special character");
		}
		
	}

}
