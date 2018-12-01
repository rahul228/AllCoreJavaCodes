package Assignment;
import java.util.Scanner;
public class P8_P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elemts you want ");
		int a=sc.nextInt();
		String b[]=new String[a];
		System.out.println("Enter the elemts of the array");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.next();
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(" "+b[i]);
		}
	}

}
