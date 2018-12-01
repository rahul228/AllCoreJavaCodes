package Assignment1;
import java.util.Scanner;
public class Temperature {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in celcius:=");
		int a=sc.nextInt();
		System.out.println("Temperature in farenheit is:="+(a+32));
	}

}
