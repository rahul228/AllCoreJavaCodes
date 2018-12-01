package ForLoop;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which table you want");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++) {
			int res=a*1;
			System.out.println(a+"*"+i+"="+res);
		}
	}

}
