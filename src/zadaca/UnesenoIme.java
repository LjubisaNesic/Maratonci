/**
 * Napisati program koji pita korisnika da unese ime, a zatim
 *  ispisuje vrijeme koje je ucesnik pod tim 
 *  imenom ostvario u maratonu citajuci ga iz fajla.
 */
package zadaca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnesenoIme {

    public static void main(String[] args) throws FileNotFoundException {
	try {
	    File file = new File("maraton.txt");
	    Scanner inputFile = new Scanner(file);

	    Scanner inputConsole = new Scanner(System.in);
	    System.out.print("Unesite ime ucesnika : ");
	    String ime = inputConsole.next();
	    int vrijeme;
	    boolean postoji = false;

	    while (inputFile.hasNext()) {
		String ocitanoIme = inputFile.next();
		if (ocitanoIme.equalsIgnoreCase(ime)) {
		    vrijeme = inputFile.nextInt();
		    System.out.println("Vrijeme koje je ostavario/la " + ocitanoIme + " je: " + vrijeme + " minuta.");
		    postoji = true;
		}
	    }
	    if (!postoji) {
		System.out.println("Ucesnik sa tim imenom nije na spisku.");
	    }

	    inputConsole.close();
	    inputFile.close();
	} catch (FileNotFoundException ex) {
	    System.out.println("File sa tim imenom ne postoji.");
	}

    }

}
