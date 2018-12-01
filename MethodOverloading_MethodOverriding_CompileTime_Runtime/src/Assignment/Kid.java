package Assignment;

public class Kid {
	void ReadBook() {
		System.out.println("I am reading a book");
	}
	
	void ReadBook(int x,int y) {
		System.out.println("I am reading two books");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kid k=new Kid();
			k.ReadBook();
			k.ReadBook(1,2);
		

	}

}
