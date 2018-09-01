/**
 * Napisati program koji prolazi kroz fajl maraton.txt i ispisuje
 * prosjecno vrijeme koje je bilo potrebno ucesnicima da zavrse maraton.
 */
package zadaca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProsijecnoVrijeme {

    public static void main(String[] args) throws FileNotFoundException {
	try {
	File file = new File("amaraton.txt");
	Scanner inputFile = new Scanner(file);
	int brojac = 0;
	int suma = 0;
	
	
	while(inputFile.hasNext()) {
	    inputFile.next();
	    suma += inputFile.nextInt();
	    brojac++;	    
	}
	
	System.out.println("Prosjecno vrijeme svih ucesnika je " + (suma/brojac) + " minuta.");
	inputFile.close();
	}
	catch (FileNotFoundException ex) {
	    System.out.println("File sa tim imenom ne postoji.");
	}
    }

}
