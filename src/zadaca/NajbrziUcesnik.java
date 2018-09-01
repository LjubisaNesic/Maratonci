/** Napisati program koji prolazi kroz fajl maraton.txt
 *  i ispisuje ime i vrijeme ucesnika koji je najbrze istrcao maraton.
 */
package zadaca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class NajbrziUcesnik {

    public static void main(String[] args) throws FileNotFoundException {
	try {
	File file = new File("maraton.txt");
	
	Scanner inputFile = new Scanner(file);
	String najbrziUcesnik = inputFile.next();
	int najbrzeVrijeme = inputFile.nextInt();
	
	while (inputFile.hasNext()) {
	    String ime = inputFile.next();
	    int vrijeme = inputFile.nextInt();
	    if (vrijeme < najbrzeVrijeme) {
		najbrziUcesnik = ime;
		najbrzeVrijeme = vrijeme;
	    }
	}
	System.out.println("Najbrzi ucesnik je " + najbrziUcesnik + " sa vremenom od " + najbrzeVrijeme + " minuta.");
	inputFile.close();
	}  catch (IOException ex) {
	    System.out.println(ex.getMessage());
	}
	
    }

}
