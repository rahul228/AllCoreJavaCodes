package Assignment1;
import java.util.Scanner;
public class Department {
	
	int id;
	String name;
	Student s;
	
	Department(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Department name");
		name=sc.next();
		System.out.println("Enter the department id");
		id=sc.nextInt();
		s=new Student();
				
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", s=" + s + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d=new Department();
		System.out.println(d);
	}
}
