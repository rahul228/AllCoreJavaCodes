package Classwork;
import java.util.Scanner;
public class Test {
	public static void main(String ar[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the class name");
		String str=sc.next();
		Bank b=(Bank) Class.forName(str).newInstance();
		System.out.println(b.getIntrest());
		sc.close();
	}
}
