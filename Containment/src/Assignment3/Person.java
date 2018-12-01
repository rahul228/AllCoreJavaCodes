package Assignment3;
import java.util.Scanner;
public class Person {
	private String Name,Gender;
	private int age;
	private Address add=new Address();
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAdd() {
		return add;
	}
	
public static void main(String ar[]) {
	Person p=new Person();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	String a=sc.next();
	p.setName(a);
	p.setGender("male");
	p.setAge(21);
//	p.setAdd(new Address());
//p.getAdd().setCity("pune");
	p.getAdd().setCity("pune");
	p.getAdd().setState("mah");
	p.getAdd().setCountry("India");
	System.out.println(p.getName());
	System.out.println(p.getAge());
	System.out.println(p.getGender());
	System.out.println(p.getAdd().getCity());
	System.out.println(p.getAdd().getState());
	System.out.println(p.getAdd().getCountry());
}
}
