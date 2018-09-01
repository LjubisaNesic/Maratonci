/**
 * Napisati program koji prolazi kroz fajl maraton.txt, pronalazi
 * ucesnike koji su zavrsili maraton za manje od 300 minuta, zatim 
 * sprema njihova imena i vrijeme u novi fajl pod nazivom najboljiMaratonci.txt
 */
package zadaca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NajboljiMaratonci {

    public static void main(String[] args) throws FileNotFoundException {
	try {
	File file = new File("maraton.txt");
	Scanner inputFile = new Scanner(file);
	
	File najboljiMaratonci = new File("najboljiMaratonci.txt");
	if(najboljiMaratonci.exists()) {
	    System.out.println("File \"" + najboljiMaratonci.getAbsolutePath() + "\" vec postoji!");
	    System.exit(1);
	} 
	PrintWriter output = new PrintWriter(najboljiMaratonci);
	System.out.println("File " + najboljiMaratonci.getPath() + " kreiran.");
	int brojac = 0;
	
	while(inputFile.hasNext()) {
	    String ime = inputFile.next();
	    int vrijeme = inputFile.nextInt();
	    if (vrijeme < 300) {
		output.print(ime + " ");
		output.println(vrijeme);
		brojac++;
	    }
	}
	
	System.out.println("Dodano " + brojac + " ucesnika u kreirani file.");
	
	inputFile.close();
	output.close();
	} catch(FileNotFoundException ex) {
	    System.out.println("File sa tim imenom ne postoji.");
	}

    }

}
