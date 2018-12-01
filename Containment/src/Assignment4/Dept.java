package Assignment4;

import java.util.Scanner;

public class Dept {
	int dept_id;
	String dname;
	
	Dept(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter department id and name");
		dept_id=sc.nextInt();
		dname=sc.next();
	}

	@Override
	public String toString() {
		return "Dept [dept_id=" + dept_id + ", dname=" + dname + "]";
	}

}
