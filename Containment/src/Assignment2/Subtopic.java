package Assignment2;
import java.util.Scanner;
public class Subtopic {
	int id;
	String name;
	Question q;
	
	Subtopic(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the topic and enter the chapter number");
		name=sc.next();
		id=sc.nextInt();
		q=new Question();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subtopic c=new Subtopic();
		System.out.println(c);
	}

	@Override
	public String toString() {
		return "Subtopic [id=" + id + ", name=" + name + ", q=" + q + "]";
	}

}
