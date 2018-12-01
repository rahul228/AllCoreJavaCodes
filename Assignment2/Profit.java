package Assignment2;
import java.util.Scanner;
public class Profit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the C.P");
		int cp=sc.nextInt();
		System.out.println("Enter the S.P");
		int sp=sc.nextInt();
		if(sp>cp) {
			System.out.println("Profit");
		}
		else {
			System.out.println("LOss");
		}
	}

}
