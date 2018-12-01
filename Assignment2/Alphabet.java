package Assignment2;
import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		if(ch>=65 && ch<=90 || ch>=96 && ch<=121) {
			System.out.println("The given char is aplphabet");
		}
		else {
			System.out.println("Not a alphabet");
		}
	}

}
