package Assignment2;
import java.util.Scanner;
public class Question {
	int id;
	String name;
	
	Question(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the question id \t Enter the Question");
		id=sc.nextInt();
		name=sc.next();
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
