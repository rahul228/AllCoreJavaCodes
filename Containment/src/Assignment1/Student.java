package Assignment1;
import java.util.Scanner;
public class Student {
	int roll;
	String name;
	
	Student(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the student");
		name=sc.next();
		System.out.println("Enter the roll number f student");
		roll=sc.nextInt();
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
