package string;

public class StringClassExample {
	public static void main(String[] args) {
		// String literal stored in string constant pool where same string will be
		// stored once
		// so here str1 and str2 are referring to same object of string constant pool
		String str1 = "HelloJava";
		String str2 = "HelloJava";

		// this will be store in heap out of constant pool cause of new keyword
		String s = new String("HelloJava");

		// This will compare reference so it will return same reference
		if (str1 == str2) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}

		// this will return not same reference because both are at different locations
		if (str1 == s) {
			System.out.println("same reference");
		} else {
			System.out.println("not same reference");
		}

		// this will compare value not reference so it will return same value
		if (str1.equals(s)) {
			System.out.println("same value");
		} else {
			System.out.println("not same value");
		}

		// we can get a particular character by it's index which start with 0
		System.out.println(str1.charAt(5));

		// length of String
		System.out.println(str1.length());

		// substring which will print all characters from index no. 5
		System.out.println(str1.substring(5));

		// same as above but start from 5 and end at 8 cause 9 is limit
		System.out.println(str1.substring(5, 9));

		//return true if string contains given string
		System.out.println(str1.contains("Java"));
	}
}
