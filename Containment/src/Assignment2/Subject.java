package Assignment2;
import java.util.Scanner;
public class Subject {
	int id;
	String name;
	Topic t;
	
	Subject() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the subject and its id");
		name=sc.next();
		id=sc.nextInt();
				t=new Topic();
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", t=" + t + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject x=new Subject();
		System.out.println(x);
	}

}
