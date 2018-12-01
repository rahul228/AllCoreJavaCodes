package ForLoop;
import java.util.Scanner;
public class Q41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the factorial");
		int a=sc.nextInt();
		int fact=1,i;
		for(i=1;i<=a;i++) {
			fact=fact*i;
			if(a==fact) {
				System.out.println("The number is"+i);
			}
			
			
		}
	}

}
