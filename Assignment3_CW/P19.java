package Assignment3_CW;

import java.util.Scanner;

public class P19 {
String nm;
int id;
int sal;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter how many employees you want");
		int n=sc.nextInt();
		P19 a[]=new P19[n];
		System.out.println("Enter employee details");
		for(int i=0;i<a.length;i++) {
			a[i]=new P19();
			System.out.println("Enter employee name");
			a[i].nm=sc.next();
			System.out.println("Enter employee id");
			a[i].id=sc.nextInt();
			System.out.println("Enter employee salary");
			a[i].sal=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i].sal==a[j].sal && i!=j) {
					System.out.println(a[i]);
				}
			}
		}
	}
	@Override
	public String toString() {
		return "P19 [nm=" + nm + ", id=" + id + ", sal=" + sal + "]";
	}

}
