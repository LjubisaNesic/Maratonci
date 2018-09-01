package zadaca;

public class Maratonac {
    private String ime;
    private int vrijeme;
    
    private static int ukupanBrojMaratonaca;
    
    public Maratonac() {
	this(null, 0);
    }
    
    public Maratonac(String ime, int vrijeme) {
	setIme(ime);
	setVrijeme(vrijeme);
	ukupanBrojMaratonaca++;
	
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(int vrijeme) {
        this.vrijeme = vrijeme;
    }

    public static int getUkupanBrojMaratonaca() {
        return ukupanBrojMaratonaca;
    }

    @Override
    public String toString() {
	return "Maratonac [ime=" + ime + ", vrijeme=" + vrijeme + "]";
    }
    
    

}
