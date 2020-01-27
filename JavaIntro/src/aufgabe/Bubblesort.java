package aufgabe;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] zahlen = { 9, 1, 5, 7, 4, 6, 3, 2, 8, 0 };
		int k;
		for (int i = 1; i < zahlen.length; i++) {
			for (int j = i; j > 0; j--) {
				if (zahlen[j] < zahlen[j - 1]) {
					k = zahlen[j];
					zahlen[j] = zahlen[j - 1];
					zahlen[j - 1] = k;
				}
			}
		}
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}
	}
}
