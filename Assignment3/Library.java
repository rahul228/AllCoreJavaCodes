package AssignmentC;
import java.util.Scanner;
public class Library {
int acc_num,days;
static int due;
String Title;
String Author;
Scanner sc=new Scanner(System.in);
	
	void input() {
		System.out.println("Enter the accession number");
		acc_num=sc.nextInt();
		System.out.println("Enter the title of the book");
		Title=sc.next();
		System.out.println("Enter the author");
		Author=sc.next();
	}
	int compute() {
		System.out.println("Enter the number of days the book is late");
		days=sc.nextInt();
		due=days*2;
		System.out.println("The due is rupees"+due);
		return due;
	}
	void display() {
		System.out.println(acc_num+" "+Title+" "+Author+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l1=new Library();
		l1.input();
		l1.compute();
		l1.display();	
	}
}
