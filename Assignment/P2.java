package Assignment;
import java.util.Scanner;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int sum=0;
		System.out.println("Enter the marks of the student");
		for(int i=1;i<a.length;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}int avg=sum/5;
		System.out.println("the aberage is"+avg);
	}

}
