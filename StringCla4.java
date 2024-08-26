package StringClasses;

public class StringCla4 {
	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("Bangalore");
		s1.append(" City");
		System.out.println(s1);
		System.out.println(s1.insert(9, " is a")); 
		
		StringBuffer s2 = new StringBuffer("Manish Tiwari");
	//	s2.delete(0, 7);
	//	System.out.println(s2);
		System.out.println(s2.substring(7));
		System.out.println(s2.substring(0,4));
		
		StringBuffer s3 = new StringBuffer("world");
		System.out.println(s3.reverse());
	}

}
