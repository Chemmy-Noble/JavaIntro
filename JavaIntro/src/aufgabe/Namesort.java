package aufgabe;

public class Namesort {

	public static void main(String[] args) {
		String name1 = "Bastian";
		String name2 = "Viktor";
		String name3 = "Chemmy";
		String name4 = "Oleg";
		String name5 = "David";
		String name6 = "Theo";
		String name7 = "Martin";
		String name8 = "Leo";
		String name9 = "Martina";
		
		int diff = name1.compareTo(name2);
		System.out.print(diff);
		if (diff < 0 ) {
			System.out.print(name1);
		}

	}

}
