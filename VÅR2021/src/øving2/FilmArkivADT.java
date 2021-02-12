package øving2;

public interface FilmArkivADT {

	Film[] hentFilmTabell();
	
	void leggTilFilm(Film nyFilm);
	
	boolean slettFilm(int filmnr);
	
	Film [] soekTittel(String delstreng);
	
	Film [] soekProdusent(String delstreng);
	
	int antall(Sjanger sjanger);
	
	int antall();
	
}
