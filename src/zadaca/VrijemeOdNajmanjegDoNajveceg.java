/**
 * Napisati program koji prolazi kroz fajl maraton.txt, a zatim
 *  ispisuje imena ucesnika i njihova vremena sortirane prema
 *   vremenu koje su ostvarili od najmanjeg prema najvecem.
 */
package zadaca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VrijemeOdNajmanjegDoNajveceg {

    public static void main(String[] args) throws FileNotFoundException {

	ArrayList<Integer> listaVremena = new ArrayList<>();
	
	try {
	File file = new File("maraton.txt");
	Scanner inputFile = new Scanner(file);
	
	
	while (inputFile.hasNext()) {
	    inputFile.next();
	    int vrijeme = inputFile.nextInt();
	    listaVremena.add(vrijeme);
	}

	Collections.sort(listaVremena);
	
	
	for (int i = 0; i < listaVremena.size(); i++) {
	    @SuppressWarnings("resource")
	    Scanner noviInputFile = new Scanner(file);
	    while (noviInputFile.hasNext()) {
		String ime = noviInputFile.next();
		int vrijeme = noviInputFile.nextInt();
		if(vrijeme == listaVremena.get(i)) {
		    System.out.println(ime + " " + vrijeme);
		}
	    }
	   
	}

	inputFile.close();
	
	} catch (FileNotFoundException ex) {
	    System.out.println("File sa tim imenom ne postoji.");
	}
    }

}
