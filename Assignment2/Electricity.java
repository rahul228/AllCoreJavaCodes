package Assignment2;
import java.util.Scanner;
public class Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter unit");
		double a=sc.nextDouble();
		double c=0;
		if(a<=50) {
			 c=a*0.5;
			
		}
		else if(a<=150) {
			 c=50*0.5+(a-50)*0.75;
			
		}
		else if(a<=250) {
			 c=50*0.5+100*0.75+(a-150)*1.20;
			
		}
		else if(a>=250) {
			 c=50*0.50+100*0.75+100*1.20+(a-250)*1.50;
			
		}
		double total=c+(c*20/100);
		System.out.println("The total bill is"+total);
		
	}

	
	
}
