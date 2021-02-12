package øving2;

public class Film {

	private int filmnr; 
	private String produsent;
	private String tittel;
	private int år;
	private Sjanger sjanger;
	private String filmselskap;

	
	public Film() {
		
	}
	
	public Film(int filmnr, String produsent, String tittel, int år, Sjanger sjanger, String filmselskap) {
		
		this.filmnr = filmnr;
		this.produsent = produsent;
		this.tittel = tittel; 
		this.år = år;
		this.sjanger = sjanger;
		this.filmselskap = filmselskap;
		
	}
	
	@Override
	public String toString() {
		return "Film [filmnr=" + filmnr + ", produsent=" + produsent + ", tittel=" + tittel + ", år=" + år
				+ ", sjanger=" + sjanger + ", filmselskap=" + filmselskap + "]";
	}

	public int getÅr() {
		return år;
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
