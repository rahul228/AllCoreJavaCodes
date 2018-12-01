package Java;
import java.util.Scanner;
public class Cycle{
	int accountNumber,noOfWheels;
	
	Cycle(){
		System.out.println("I am in the default constructor");
		
	}
	
	Cycle(int x,int y){
		this();
		System.out.println("I am in another constructor");
	}
	public static void main(String ar[]) {
		//Cycle cycle=new Cycle();
		Cycle c1=new Cycle(20,30);
	}
}
