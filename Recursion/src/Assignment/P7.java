package Assignment;

public class P7 {
		public static boolean gcdlike(int p, int q) {
		if (q == 0) 
		return (p == 1);
		return gcdlike(q, p % q);
		}
		public static void main(String args[]) {
		System.out.println(gcdlike(4, 4));
		}
		}
