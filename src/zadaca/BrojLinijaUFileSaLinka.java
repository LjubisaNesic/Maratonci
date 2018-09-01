/**
 * Napisati program koji ispisuje koliko ima linija u fajlu koji se nalazi na sledecoj adresi:
 * http://www.textfiles.com/science/astronau.txt
 */
package zadaca;

import java.io.IOException;

public class BrojLinijaUFileSaLinka {

    public static void main(String[] args) {
	try {
	    java.net.URL url = new java.net.URL("http://www.textfiles.com/science/astronau.txt");
	    java.util.Scanner input = new java.util.Scanner(url.openStream());
	    int brojac = 0;
	    System.out.println(input.hasNextLine());
	    while (input.hasNextLine()) {
		brojac++;
		input.nextLine();
	    }
	    
	    System.out.println("Broj linija u file na adresi " + url.getPath() + " je " + brojac); 
	    input.close();
	    
	} catch (java.net.MalformedURLException ex) {
	    System.out.println("Pogresan URL");
	} catch (IOException e) {
	    System.out.println("I/O Greske: Ne postoji takav file.");
	} 

    }

}
