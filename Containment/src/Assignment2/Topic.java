package Assignment2;
import java.util.Scanner;
public class Topic {
	int id;
	String name;
	Subtopic s1;
	
	Topic(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the topic and also enter the subject id");
		name=sc.next();
		id=sc.nextInt();
		s1=new Subtopic();
	}
	

	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", s1=" + s1 + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Topic z=new Topic();
			System.out.println(z);
	}

}
