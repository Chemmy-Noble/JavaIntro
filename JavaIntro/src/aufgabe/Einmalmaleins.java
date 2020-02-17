package aufgabe;

import java.util.Scanner;

public class Einmalmaleins {

	private static Scanner scanner;

	public static void main(String[] args) {
		float a, b, c;
		String operator;
		scanner = new Scanner(System.in);
		System.out.println("Erste Zahl:");
		a = scanner.nextFloat();
		System.out.println("Zweite Zahl:");
		b = scanner.nextFloat();
		System.out.println("Operator:");
		operator = scanner.next();
		if ("+".equals(operator)) {
			c = a + b;
			System.out.println("Ergebnis: " + c);
		} else if ("-".equals(operator)) {
			c = a - b;
			System.out.println("Ergebnis: " + c);
		} else if ("/".equals(operator)) {
			c = a / b;
			System.out.println("Ergebnis: " + c);
		} else if ("*".equals(operator)) {
			c = a * b;
			System.out.println("Ergebnis: " + c);
		} else {
			System.out.println("ERR0R");
		}
		;
	}
}