package Assignment2;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		char ch=sc.next().charAt(0);
		if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
			System.out.println("The given alphabet is vowel");
		}
		else {
			System.out.println("The given alphabet is consonant");
		}
	}

}
