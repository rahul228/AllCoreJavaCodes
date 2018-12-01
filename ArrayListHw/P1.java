package ArrayListHw;
import java.util.*;
public class P1 {
	int id,sal;
	String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sal;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		P1 other = (P1) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sal != other.sal)
			return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList <P1> al=new ArrayList();
		P1 a1=new P1();
		a1.id=1;
		a1.name="Rahul";
		a1.sal=10000;
		
		P1 a2=new P1();
		a2.id=2;
		a2.name="kulkarni";
		a2.sal=100000;
		
		P1 a3=new P1();
		a1.id=3;
		a1.name="Rahul kulkarni";
		a1.sal=20000;
		
		al.add(a1);
		al.add(a2);
		al.add(a3);
		System.out.println(al);
		
		for(int i=0;i<al.size();i++) {
			P1 oba=al.get(i);
		}
		for(P1 obj:al) {
			if(obj.sal>10000) {
				System.out.println(obj);
			}
		}
		
		
		
	}
	@Override
	public String toString() {
		return "P1 [id=" + id + ", sal=" + sal + ", name=" + name + "]";
	}
	
}
