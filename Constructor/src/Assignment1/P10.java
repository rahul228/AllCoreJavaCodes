package Assignment1;

public class P10 {
	
	float per;
	
	P10(){
		this(435,450);
	}
	
	P10(int x,int y){
		System.out.println("The student got "+x+" out off " +y);
		
	}
	
	double Percentage(float f,float g) {
		per=f/g;
		return per;
		
	}
	
	void Display(double x) {
		System.out.println("The student got" +x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P10 p1=new P10();
		double b=p1.Percentage(435.0f,450.0f);
		p1.Display(b);
	}

}
