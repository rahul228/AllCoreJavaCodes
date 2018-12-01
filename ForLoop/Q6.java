package ForLoop;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int a=sc.nextInt();
		int counter=0,res;
		for(int i=1;i<=a;i++) {
			if(a%i==0)  
				counter++;
			
		}
			if(counter==2) {
				System.out.println("The number is prime");
			}
			else {
				System.out.println("THe number is not prime");
			}
		}
	}


