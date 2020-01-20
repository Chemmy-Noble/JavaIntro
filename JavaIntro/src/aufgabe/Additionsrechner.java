package aufgabe;

import java.util.Scanner;

public class Additionsrechner {

	public static void main(String[] args) {

		Scanner eingabewert = new Scanner(System.in);
//
		float a, b, c;
		String operator;
		System.out.print("Erste Zahl:");
		a = eingabewert.nextInt();
		System.out.print("Zweite Zahl:");
		b = eingabewert.nextInt();
		System.out.print("Operator:");
		operator = eingabewert.next();
		if (operator.equals("+")) {
			c = a + b;
			System.out.print("Ergebnis" + c);
		} else if (operator.equals("*")) {
			c = a * b;
			System.out.print("Ergebnis" + c);
		} else if (operator.equals("-")) {
			c = a - b;
			System.out.print("Ergebnis" + c);
		} else if (operator.equals("/")) {
			c = a / b;
			System.out.print("Ergebnis" + c);
		} else {System.out.print("Syntax Error");}; 
		;

	}

}
