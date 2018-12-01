package Assignment2;
import java.util.Scanner;
public class Institute {
	int id;
	String name;
	Branch b;
	
	Institute(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of institute and its id");
		name=sc.next();
		id=sc.nextInt();
		b=new Branch();
		
		
	}

	@Override
	public String toString() {
		return "Institute [id=" + id + ", name=" + name + ", b=" + b + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Institute i=new Institute();
		System.out.println(i);
	}

}
