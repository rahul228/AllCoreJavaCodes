package August10;
import java.util.Scanner;
public class A1 {
	
	void compare(int a,int b) {
		if(a>b) {
			System.out.println("The bigger number is"+a);
		}
		else {
			System.out.println("The bigger number is"+b);
		}
	}
	
	void compare(char a,char b) {
		if(a>b) {
			System.out.println("The bigger number is"+a);
		}
		else {
			System.out.println("The bigger number is"+b);
		}
	}
	
	void compare(float a,float b) {
		if(a>b) {
			System.out.println("The bigger number is"+a);
		}
		else {
			System.out.println("The bigger number is"+b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.int\n2.char\n3.float");
		A1 p1=new A1();
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		
		case 1:System.out.println("Enter the first number");
		 	   int b=sc.nextInt();
		 	   System.out.println("Enter the first number");
		 	   int c=sc.nextInt();			
		 	   p1.compare(b,c);
		 	   break;
		 	   
		case 2:System.out.println("Enter the first number");
	 	   	char w=sc.next().charAt(0);
	 	   	System.out.println("Enter the first number");
	 	   	char q=sc.next().charAt(0);			
	 	   	p1.compare(w,q);
	 	   	break;
	 	   	
	 	   	
		case 3:System.out.println("Enter the first number");
	 	   float f=sc.nextFloat();
	 	   System.out.println("Enter the first number");
	 	   float f1=sc.nextFloat();			
	 	   p1.compare(f,f1);
	 	   break;
		}

	}

}
