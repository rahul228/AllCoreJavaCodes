package NestedFor;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=2,odd=1;
		for(int i=1;i<=5;i++) {
			for(int j=i;j>=1;j--) {
				if(i%2==0) {
					
					System.out.print(even);
					even+=2;
				}
				else {
					System.out.print(odd);
					odd+=2;
				}
				
				
			}System.out.println();
		}
	}

}
