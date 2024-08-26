package StringClasses;

public class StringBuild2 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Testing with Rohit");
		StringBuilder sb2 = new StringBuilder("Testing with Java");
		sb1.append(" Java");
		System.out.println(sb1);
		sb1.delete(19, 23);
		System.out.println(sb1);
		sb1.repeat('r', 4);
		System.out.println(sb1);
		char c1=sb1.charAt(3);
		System.out.println(c1);
		sb1.delete(19, 23);
		System.out.println(sb1);
		boolean eq=sb1.equals(sb2);
		System.out.println(eq);
		sb1.ensureCapacity(100);
		int cap=sb1.capacity();
		System.out.println(cap);
		System.out.println(sb1.length());
		sb1.insert(12, " Java and");
		System.out.println(sb1);
		System.out.println(sb1.substring(5));
		System.out.println(sb1.substring(13, 27));
		sb1.reverse();
		System.out.println(sb1);
		
		
  
		
		
		
		
		
	}

}
