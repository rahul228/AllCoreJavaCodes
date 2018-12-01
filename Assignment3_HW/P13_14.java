package Assignment3_HW;

import java.util.Scanner;

public class P13_14 {
int emp_id;
String emp_name;
int sal;
Dept d;
Date1 dt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many employees you want");
		int a=sc.nextInt();
		P13_14 b[]=new P13_14[a];
		for(int i=0;i<b.length;i++) {
			b[i]=new P13_14();
			b[i].d=new Dept();
			b[i].dt=new Date1();
			System.out.println("Enter the name of the emoployee");
			b[i].emp_name=sc.next();
			System.out.println("Enter the id of the employee");
			b[i].emp_id=sc.nextInt();
			System.out.println("Enter the salaray of the employee");
			b[i].sal=sc.nextInt();
			System.out.println("Enter the department of employee");
			b[i].d.d_name=sc.next();
			System.out.println("Enter the department id");
			b[i].d.d_id=sc.nextInt();
			System.out.println("Enter the date of joining");
			b[i].dt.dd=sc.nextInt();
			System.out.println("Enter the Month of joining");
			b[i].dt.mm=sc.nextInt();
			System.out.println("Enter the year of joining");
			b[i].dt.yy=sc.nextInt();
				
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(b[i].d.d_name==b[j].d.d_name && i!=j) {
				System.out.println(b[i]);	
				}
			}
			
		}

	}
	@Override
	public String toString() {
		return "emp_id=" + emp_id + ", emp_name=" + emp_name + ", sal=" + sal + ", d=" + d + ", dt=" + dt;
	}

}
