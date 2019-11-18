package aufgabe;

import java.util.Scanner;

public class Additionsrechner {

public static void main(String[] args) {
int L,F,B;
Scanner eingabewert = new Scanner(System.in);
//
        L = eingabewert.nextInt(); 
        B = eingabewert.nextInt();
        F = L + B;
        System.out.println(F);
}

}
