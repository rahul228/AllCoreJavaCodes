package August3;
import java.util.Scanner;
public class PraticeConstructor {
	
	int acc_id;
	String name;
	
	PraticeConstructor(){
		this(1,"Rahul",78);
		System.out.println("You are in default");
	}
	
	PraticeConstructor(int x,String y){
		this();
		System.out.println("You are in 2 parameter constructor");
	}
	
	PraticeConstructor(int x,String y,int z){
		System.out.println("You are in 3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 PraticeConstructor b1=new  PraticeConstructor(1,"Rah");
		 System.out.println(b1);
		 
	}

}
