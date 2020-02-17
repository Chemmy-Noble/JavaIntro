package aufgabe;

import java.util.ArrayList;

public class Namesort {

	public static void main(String[] args) {
		String l;
		int i, j;
		ArrayList<String> name = new ArrayList<String>();
		name.add("Basti");
		name.add("Viktor");
		name.add("Chemmy");
		name.add("Oleg");
		name.add("David");
		name.add("Martin");
		name.add("Leo");
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