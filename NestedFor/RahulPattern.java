package NestedFor;

public class RahulPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=6;i++) {
			for(j=1;j<=4;j++) {
				 
					if(j==1||i==1||i==3||(j==4&&i==2)||(i==4&&j==2)||(i==5&&j==3)||(i==6&&j==4)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				
			
		}System.out.println();
		}
	}
}

	


