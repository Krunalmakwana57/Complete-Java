package basics;

public class Operators {
	
	public static void main(String[] args) {
		/**
		 * @author Krunal Makwana
		 * 	
		 * Types of operators
		 *1.Assignment operator
		 *2.Arithmetic operator
		 *3.Logical operator
		 *4.Ternary operator
		 *5.Relational operator
		 * 
		 */
		
		//1.Assignment operator -> defined by (=) operator
		int age = 18;
		System.out.println(age);
		
		
		//2.Arithmetic operator -> +,-,*,/,%
		int num1 = 20, num2 = 10;
		//addition
		System.out.println("addition : "+(num1 + num2));
		
		//subtraction
		System.out.println("subtraction : "+(num1 - num2));
		
		//multiplication
		System.out.println("multiply : "+(num1 * num2));
		
		//division
		System.out.println("division : "+(num1 / num2));
		
		//remainder this will give remainder of 20%10 = 0
		System.out.println("remainder : "+(num1 % num2));
		
		
		//3.Logical operator -> &&(logical and), ||(logical or), !(logical not)
		//&& will return false if any of given condition is false
		if(10 > 5 && 3 < 5) {
			//it will return true
		}
		
		//|| will return true if any of given condition is true
		if(10 > 5 || 3 > 5) {
			//it will return true
		}
		
		// ! will return false if condition true and vise versa 
		
		
		//4.Ternary operator -> type variable = condition ? true : false;
		int max = num1 > num2 ? num1 : num2;
		System.out.println("Max in ternary : "+max);
		
		//5.Relational operator -> ==,>=,<=,!=
		
		if(age >= 18) {
			System.out.println("eligible");
		}else if(age <= 18) {
			System.out.println("not eligible");
		}
		
	}
}
