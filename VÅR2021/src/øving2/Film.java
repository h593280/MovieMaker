package �ving2;

public class Film {

	private int filmnr; 
	private String produsent;
	private String tittel;
	private int �r;
	private Sjanger sjanger;
	private String filmselskap;

	
	public Film() {
		
	}
	
	public Film(int filmnr, String produsent, String tittel, int �r, Sjanger sjanger, String filmselskap) {
		
		this.filmnr = filmnr;
		this.produsent = produsent;
		this.tittel = tittel; 
		this.�r = �r;
		this.sjanger = sjanger;
		this.filmselskap = filmselskap;
		
	}
	
	@Override
	public String toString() {
		return "Film [filmnr=" + filmnr + ", produsent=" + produsent + ", tittel=" + tittel + ", �r=" + �r
				+ ", sjanger=" + sjanger + ", filmselskap=" + filmselskap + "]";
	}

	public int get�r() {
		return �r;
	}

	public String getFilmselskap() {
		return filmselskap;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}
	
	public int getFilmnr() {
		return filmnr;
	}
	
	public String getTittel() {
		return tittel;
	}
	
	public String getProdusent() {
		return produsent;
	}
	
}
