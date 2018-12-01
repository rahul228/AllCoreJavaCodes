package Assignment3_HW;

import java.util.Scanner;

public class P12 {
int id;
int sal;
String name;
Date d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many employees you want");
		int a=sc.nextInt();
		P12 b[]=new P12 [a];
		for(int i=0;i<b.length;i++) {
			b[i]=new P12();
			b[i].d=new Date();
			System.out.println("Enter the name of the employee");
			b[i].name=sc.next();
			System.out.println("Enter the id");
			b[i].id=sc.nextInt();
			System.out.println("Enter the salary");
			b[i].sal=sc.nextInt();
			System.out.println("Enter the date");
			b[i].d.dd=sc.nextInt();
			System.out.println("Enter the month");
			b[i].d.mm=sc.nextInt();
			System.out.println("Enter the year");
			b[i].d.yy=sc.nextInt();
		}for(int i=0;i<b.length;i++) {
			boolean flag=true;
			for(int j=0;j<b.length;j++) {
				if(b[i].d.dd==b[j].d.dd &&b[i].d.mm==b[j].d.mm && b[i].d.yy==b[j].d.yy && i!=j) {
					flag=false;
				}if(flag==false)
		System.out.println(b[i]);
		}
	}

	}

	@Override
	public String toString() {
		return "P12 [id=" + id + ", sal=" + sal + ", name=" + name + ", d=" + d + "]";
	}

}
