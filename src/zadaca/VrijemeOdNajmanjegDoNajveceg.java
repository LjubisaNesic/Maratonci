/**
 * Napisati program koji prolazi kroz fajl maraton.txt, a zatim
 *  ispisuje imena ucesnika i njihova vremena sortirane prema
 *   vremenu koje su ostvarili od najmanjeg prema najvecem.
 */
package zadaca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VrijemeOdNajmanjegDoNajveceg {

    public static void main(String[] args) throws FileNotFoundException {
	File file = new File("maraton.txt");
	Scanner inputFile = new Scanner(file);
	
	while (inputFile.hasNext()) {
	    
	}

	inputFile.close();
    }

}
