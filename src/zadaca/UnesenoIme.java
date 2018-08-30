/**
 * Napisati program koji pita korisnika da unese ime, a zati
 *  ispisuje vrijeme koje je ucesnik pod tim 
 *  imenom ostvario u maratonu citajuci ga iz fajla.
 */
package zadaca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnesenoIme {

    public static void main(String[] args) throws FileNotFoundException {
	File file = new File("maraton.txt");
	Scanner inputFile = new Scanner(file);
	
	Scanner inputConsole = new Scanner(System.in);
	System.out.print("Unesite ime: ");
	String ime = inputConsole.next();
	int vrijeme;
	
	while(inputFile.hasNext()) {
	    String ocitanoIme = inputFile.next();
	    if (ocitanoIme.equals(ime)) {
		vrijeme = inputFile.nextInt();
		System.out.println("Vrijeme koje je ostavario/la " + ocitanoIme + " je: " + vrijeme + " minuta.");
	    }
	}
	inputConsole.close();
	inputFile.close();

    }

}
