package WhileLoop;
import java.util.Scanner;
public class Fact {
	public static void main(String r[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	int fact=1,i=1;
	while(i<=a) {
		fact=fact*i;
		i++;
	}System.out.println(fact);
	}

}
