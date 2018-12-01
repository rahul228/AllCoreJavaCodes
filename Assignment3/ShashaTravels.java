package AssignmentC;
import java.util.Scanner;
public class ShashaTravels {
	int amt;
	String Name;
	double netamount,discount;
	int i;
	Scanner sc=new Scanner(System.in);
	void Discount() {
		System.out.println("Enter the name of customer");
		Name=sc.nextLine();
		System.out.println("Enter the ticket charges");
		amt=sc.nextInt();
		
		if(amt>70000) {
			discount=18;
			netamount=amt-(amt*18/100);
		}
		else if(amt>=55001 && amt<=70000) 
		{
			discount=16;
			netamount=amt-(amt*16/100);
		}
		else if(amt>=35001 && amt<=55000) {
			discount=12;
			netamount=amt-(amt*12/100);
		}
		else if(amt>25001 && amt<=35000) {
			discount=10;
			netamount=amt-(amt*10/100);
		}
		else if(amt<25001) {
			discount=2;
			netamount=amt-(amt*2/100);
		}
	}
	
	ShashaTravels() {
		i++;
		
	}
	void NetAmount() {
		System.out.println(i+" "+Name+" "+amt+" "+discount+" "+ netamount+" \n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	ShashaTravels b1=new ShashaTravels();
	b1.Discount();
	b1.NetAmount();
	ShashaTravels b2=new ShashaTravels();
	b2.Discount();
	b2.NetAmount();
	}

}
