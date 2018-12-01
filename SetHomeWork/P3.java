package SetHomeWork;

import java.util.HashSet;

public class P3 {
	int id;
	String name;

	public P3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<P3> hs=new HashSet<P3>();
		hs.add(new P3(1,"Rahul"));
		hs.add(new P3(3,"AShutosh"));
		hs.add(new P3(2,"Rahul"));
		hs.add(new P3(0,"Chetan"));
		
		System.out.println(hs);
		
	}


	@Override
	public int hashCode() {
		return id;
	}


	@Override
	public boolean equals(Object obj) {
		P3 s=(P3) obj;
		if(s.id==this.id&&s.name.equals(this.name)) {
			return true;
		}
		else {
			return false;
		}
	}


	@Override
	public String toString() {
		return "id " + id + " name " + name ;
	}

}
