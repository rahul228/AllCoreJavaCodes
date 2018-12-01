package Assignment4;

import java.util.Scanner;

public class Mydata {
	int mm,dd,yy;
	
	Mydata(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mm dd yy");
		mm=sc.nextInt();
		dd=sc.nextInt();
		yy=sc.nextInt();
	}

	@Override
	public String toString() {
		return "Mydata [mm=" + mm + ", dd=" + dd + ", yy=" + yy + "]";
	}

}
