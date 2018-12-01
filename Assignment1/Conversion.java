package Assignment1;
import java.util.Scanner;
public class Conversion {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter in centimeter:=");
		int a=sc.nextInt();
		
		System.out.println("Centemeter to meter is:="+a/100.0);
		
		System.out.println("centemeter to kilometer conversion is:="+a/100000.0);
	}

}
