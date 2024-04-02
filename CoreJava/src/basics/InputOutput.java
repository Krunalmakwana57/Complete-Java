package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) throws IOException {
		/**
		 * @author Krunal Makwana
		 * 
		 * we have BufferedReader and Scanner classes to read data or take input
		 * and System.out.println() method to show output on console 
		 * 
		 */
		
		//BufferedReader Example
		//BufferedReader takes input as String so if you want to change value in int or double you can use 
		//parse(String obj)method of different wrapper classes
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter a String : ");
		String s = br.readLine();
		System.out.println("you entered = "+s);
		
		
		//Scanner Example
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("you entered = "+num);
		
		System.out.print("Enter name : ");
		String name = sc.nextLine();
		System.out.println("you entered = "+name);
		
		sc.close();
		
	}
}
