package string;

public class StringIntro {

	public static void main(String[] args) {

		// a String is sequence of characters
		// there are 4 ways to create an array ->
//		1.array of chars 
//		2.String class -> immutable
//		3.StringBuffer class -> mutable
//		4.StringBuilder class -> mutable

		// using array of characters
		char ch[] = { 'H', 'e', 'l', 'l', 'o', 'J', 'a', 'v', 'a' };

		// using String class
		String str = "HelloJava";
		// or
		String s = new String("HelloJava");

		// using StringBuffer class
		// Thread-safe
		StringBuffer sbf = new StringBuffer("HelloJava");

		// using StringBuilder class
		// not Thread-safe
		StringBuilder sbr = new StringBuilder("HelloJava");
		
		for(int i = 0; i < ch.length; i++) {
			if(i == 0) {
				System.out.print("Character array : ");
			}
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("String literal : "+str);
		System.out.println("String Object : "+s);
		System.out.println("StringBuffer : "+sbf);
		System.out.println("StringBuilder : "+sbr);

	}

}
