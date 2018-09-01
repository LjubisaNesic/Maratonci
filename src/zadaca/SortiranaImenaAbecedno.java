/**
 * Napisati program koji ucitava imena iz fajla imena.txt,
 * a zatim ih ispisuje sortirane po abecedi.
 */
package zadaca;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class SortiranaImenaAbecedno {

    public static void main(String[] args) {
	ArrayList<String> imena = new ArrayList<>();
	try {
	    java.io.File file = new java.io.File("imena.txt");
	    java.util.Scanner input = new java.util.Scanner(file);
	    
	    while (input.hasNext()) {
		String ime = input.next();
		imena.add(ime);
	    }
	    
	    Collections.sort(imena);
	    for (String string : imena) {
		System.out.println(string);
	    }
	    input.close();

	} catch (FileNotFoundException ex) {
	    System.out.println("File sa tim imenom ne postoji.");
	}

    }

}
