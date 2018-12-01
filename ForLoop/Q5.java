package ForLoop;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to find factors of");
		int a=sc.nextInt();
		int num;
		System.out.println("Factors of given number are");
		for(int i=1;i<=a;i++) {
			num=a%i;
			if(num==0) {
				System.out.println(i);
			}
		}
	}

}
