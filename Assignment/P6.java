package Assignment;
import java.util.Scanner;
public class P6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<5;i++) {
		a[i]=sc.nextInt();	
		}
		for(int i=4;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
