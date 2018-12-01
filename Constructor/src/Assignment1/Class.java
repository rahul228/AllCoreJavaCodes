package Assignment1;

public class Class {
	
	int a,b;
	
	Class(float x, float y){
		
		x=(int)(x);
		y=(int)(y);
		System.out.println(x);
		System.out.println(y);
		System.out.println("You are in float");
	}
	
	/*Class(long x,long y){
		System.out.println("You are in long");
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class A=new Class(20,30);

	}

}
