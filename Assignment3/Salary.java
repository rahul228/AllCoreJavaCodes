package AssignmentC;
import java.util.Scanner;
public class Salary {
	String Name,Address,Subject_Specialization;
	long Phone_Number;
	int Monthly_Slary,Income_Tax,Annual_Salary,sum,Slary,Final_Slary;

	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the teacher");
		Name=sc.nextLine();
		System.out.println("Enter the Monthly salary of the teacher");
		Monthly_Slary=sc.nextInt();		
		Annual_Salary=Monthly_Slary*12;
		System.out.println("The teacher annual salary is "+Annual_Salary);
	}
void incometax() {
		
		if(Annual_Salary<175000) {
			System.out.println("The Teacher"+Name+" does not need to pay income tax and her salary is"+Annual_Salary);
		}
		else {
			sum=Annual_Salary-175000;
			Slary=sum*5/100;
			Final_Slary=Annual_Salary-Slary;
			
			System.out.println("The Teacher" +Name+" Need to pay income tax at the rate of 5% and her salary is "+Final_Slary);
		}
	}
	void display() {
		
		System.out.println("The name of Teacher is "+Name+" her monthly salary is "+Monthly_Slary+" Rupees");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s1=new Salary();
		s1.accept();
		s1.display();
		s1.incometax();
	}

}
