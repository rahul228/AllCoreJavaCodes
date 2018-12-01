package Classwork;

public abstract class Bank {

	Bank(){
		System.out.println("I am in default cons");
	}
	
	public void withdraw() {
		System.out.println("I am withdrawig");
	}
	
	public abstract float getIntrest();
	


}
