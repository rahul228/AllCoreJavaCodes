package Assignment;
import java.util.Scanner;
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre how many elemts you want in your array");
		int b;
		int a[]=new int[b=sc.nextInt()];
		System.out.println("Enter the elemts of the array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println("\nEnter the elemts you want to search");
		int e=sc.nextInt();
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(e==a[i]) {
				c++;
			}		
		}if(c==1) {
			System.out.println("Elemets found");
		}
		else {
			System.out.println("Not found");
		}

	}

}
