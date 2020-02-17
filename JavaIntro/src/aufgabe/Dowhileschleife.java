package aufgabe;

import java.util.ArrayList;
import java.util.Scanner;

public class Dowhileschleife {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		String line = "";
		ArrayList<String> name = new Arraylist<String>();
		while (! line.contentEquals("y")) {
			line = eingabe.nextLine();
			name.add(line);
		}
		for (i = 1; i < name.size(); i++) {
			for (j = 0; j > 0; j--) {
				if (name.get(j).compareToIgnoreCase(name.get(j + 1)) > 0) {
					l = name.get(j);
					name.set(j, name.get(j + 1));
					name.set(j + 1, l);
					System.out.println(name);

				}
			}
		}


	}

}
