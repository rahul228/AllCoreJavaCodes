package Classwork;

import java.util.Scanner;

public class Split_MatchesFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		//mathches
		/*if(s.matches("(91)?[0-9]*")) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}*/
		if(s.matches("[a-z_.A-Z0-9]*@([a-zA-Z])+([.][a-zA-Z]+)")) 
			System.out.println("True");
		else
			System.out.println("False");
		
		//split function
		String str[]=s.split("\\d");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}

}
