package aufgabe;

import java.util.Scanner;

public class Additionsrechner {

public static void main(String[] args) {
int L,F,B;
Scanner eingabewert = new Scanner(System.in);
//
        System.out.print("Geben Sie die Laenge L ein (in cm): ");
        L = eingabewert.nextInt();
        System.out.print("Geben Sie die Breite B ein (in cm): ");
        B = eingabewert.nextInt();
        F = L * B;
        System.out.println("Die Flaeche des Rechtecks ist: " + F + " cm^2");
}

}
