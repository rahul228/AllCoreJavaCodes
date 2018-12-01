package WhileLoop;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the range");
		int a=sc.nextInt();
		int num=0;
		
		for(int i=2;i<=a;i++) {
			int counter=0;
			for(num=i;num>=1;num--) {
			if(i%num==0) {
				counter++;
			}
			
			}
			if(counter==2) {
				System.out.println(i);
			}
			
			
		}
	}

}
