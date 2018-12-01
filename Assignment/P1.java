package Assignment;
import java.util.Scanner;
public class P1 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner (System.in);
		int a[]=new int[5];
		System.out.println("Enter the elemennts of the array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
