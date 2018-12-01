package Assignment1;
import java.util.Scanner;
public class Temperature1 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the temperature in farenheit:=");
	int a=sc.nextInt();
	System.out.println("Temperature in celcius is:="+(a-32));
}
}
