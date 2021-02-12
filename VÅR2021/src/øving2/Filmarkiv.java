package øving2;

public class Filmarkiv implements FilmArkivADT {

	private Film[] filmTabell;
	private int antall;
	
	//hjelpemetoder
	private void utvidKapasitet() {
		Film [] hjelpeTabell = new Film [antall + 1];
		for (int i = 0; i < filmTabell.length; i++) {
			hjelpeTabell[i] = filmTabell[i];
		}
		filmTabell = hjelpeTabell;
	}
	
	private Film[] trimTab(Film [] tab, int n) {
		Film[] filmtab2 = new Film [n];
		int i = 0;
		while(i < n) {
			filmtab2[i] = tab[i];
			i++;
		}
		return filmtab2;
	}
	
	//konstruktør 
	public Filmarkiv(int lengde) {
	filmTabell = new Film [lengde];
	antall = 0;
	}
	
	
	
	@Override
	public Film[] hentFilmTabell() {
		//retunrnere en tabell av filmer(full tabell)
		
		if(antall < filmTabell.length) {
			filmTabell = trimTab(filmTabell, antall);
		}
		
		return filmTabell;

	}
	@Override
	public void leggTilFilm(Film nyFilm) {
		// Legger til en ny FIlm
		
		if(antall == filmTabell.length) {
			utvidKapasitet();
		}
	
		filmTabell[antall] = nyFilm;
		antall++;
	
		}
	
	
	@Override
	public boolean slettFilm(int filmnr) {
		//Sletter en film hvis den fins
	
		
		for (int i = 0; i < antall; i++) {
			if(filmTabell[i].getFilmnr() == filmnr) {
				//slette
				antall--;
				filmTabell[i] = filmTabell[antall];
				filmTabell[antall] = null;
				//trim
				trimTab(filmTabell, antall);
				return true;
			}
			
			
		}
		return false;
		
	}
	@Override
	public Film[] soekTittel(String delstreng) {
		//søker og henter filmer med en gitt delstring
		
		Film [] nyTab1 = new Film [antall];
		int counter = 0;
		
		for (int i = 0; i < antall; i++) {
			if(filmTabell[i].getTittel().contains(delstreng)){
				nyTab1[counter] = filmTabell[i];
				counter++;
			}
		}
		
		return trimTab(nyTab1, counter);
	}
	@Override
	public Film[] soekProdusent(String delstreng) {
		//søker og henter produsent med en gitt delstring
		
		Film [] nyTab2 = new Film [antall];
		int counter = 0;
		
		for (int i = 0; i < antall; i++) {
			if(filmTabell[i].getProdusent().contains(delstreng)){
				nyTab2[counter] = filmTabell[i];
				counter++;
				
			}
		}
		
		return trimTab(nyTab2, counter);
	}
	@Override
	public int antall(Sjanger sjanger) {
		//henter antall filmer for en gitt sjanger
		
		int counter = 0;
		
		for (int i = 0; i < antall; i++) {
		if(filmTabell[i].getSjanger().equals(sjanger)) {
			counter++;
		 }
		}
		
		return counter;
	}
	@Override
	public int antall() {
		return antall;
	}
	
	
	
	
}
