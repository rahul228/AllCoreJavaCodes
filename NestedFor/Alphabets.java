package NestedFor;

public class Alphabets {
	public static void main(String ar[]) {
		char i,j,m;
		int l;
		int sp=0;
		for(i='G';i>='A';i--) {
			for(j='A';j<=i;j++) {
				System.out.print(j);
			}
			for(l=sp;l>1;l--) {
				System.out.print(" ");
			}
			for(m=i;m>='A';m--) {
				if(m=='G')
				continue;
			System.out.print(m);		
			}System.out.println();
			sp+=2;
		}
	}
}
