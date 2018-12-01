package Ternaryoperator;
import java.util.Scanner;
public class Prattice {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sales");
		int sales=sc.nextInt();
		
		System.out.println(sales>3000?sales*30/100:0);
	}

}
