package Assignment;
import java.util.Scanner;
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int a[]=new int[5];
		System.out.println("Enter the elemts of the array");
		for(int i=0;i<5;i++) {
		a[i]=sc.nextInt();	
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Enter the element you want");
		int e=sc.nextInt();
		for(int i=0;i<5;i++) {
		if(e==a[i]) {
			System.out.println(i);
		}
	}
	}
	

}
