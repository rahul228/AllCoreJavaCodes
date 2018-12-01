package Assignment2;
import java.util.Scanner;
public class Branch {
	int id;
	String name;
	Subject s;

	Branch(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the branch name and its id");
		name=sc.next();
		id=sc.nextInt();
		s=new Subject();
		
	}
	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + ", s=" + s + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branch b=new Branch();
		System.out.println(b);
	}

}
