package Assignment4;

import java.util.Scanner;

public class Emp {
String name;
int id,salary;
Dept d;
Mydata d1;


Emp(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name id and salary");
	name=sc.next();
	id=sc.nextInt();
	salary=sc.nextInt();
	d=new Dept();
	d1=new Mydata();
}

@Override
public String toString() {
	return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + ", d=" + d + ", d1=" + d1 + "]";
}

public static void main(String ar[]) {
	Emp e=new Emp();
	System.out.println(e);
}
}
