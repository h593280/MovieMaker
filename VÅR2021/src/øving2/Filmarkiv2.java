package øving2;

public class Filmarkiv2 implements FilmArkivADT {

	private int antall;
	private LinearNode <Film> start;
	//ingen referenase til siste, kun start
	
	//konstruktør 
	public Filmarkiv2() {
	//opprette node 
	start = new LinearNode<Film>();
	antall = 0;
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
	
	
	@Override
	public Film[] hentFilmTabell() {
		
		//oppretter tabell
		Film [] hjelpeTab = new Film[antall];
		
		//opprette ny linearNode som er start, fordi vi ikke vil endre den opprinnelige starten. 
		//starten vil peke på neste hvis vi ikke opprette ny node.
		LinearNode <Film> nyNode = start;
		
		for (int i = 0; i < antall; i++) {
			hjelpeTab[i] = nyNode.getElement();
			nyNode = nyNode.getNeste();
		}
			
		return hjelpeTab;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {	
		
		LinearNode <Film> denne = new LinearNode<>(nyFilm);
		//denne peker på neste for start
		denne.setNeste(start);
		//denne er lik start
		start = denne;
		antall++;
		

	}

	@Override
	public boolean slettFilm(int filmnr) {
		
		boolean slettet = false;
		LinearNode<Film> forrige = start;
		LinearNode<Film> denne = forrige.getNeste();
		
		//sjekker om den er tom
		if(antall == 0) {
		return slettet;
		}
		
			
		while(denne != null && !slettet) {
			//teste på første node
			if(forrige.getElement().getFilmnr() == filmnr) {
				forrige = forrige.getNeste();
				antall--;
				slettet = true;
			//tester de andre
		} else if (denne.getElement().getFilmnr() == filmnr) {
			forrige.setNeste(denne.getNeste());
			antall--;
			slettet = true;
		}
	}
		return slettet;
		
	}
		
		

	@Override
	public Film[] soekTittel(String delstreng) {
		
		Film [] hjelpeTab = new Film[antall];
		LinearNode <Film> denne = start;
		int counter = 0;
		
		for (int i = 0; i < antall; i++) {
			if(denne.getElement().getTittel().contains(delstreng)) {
			hjelpeTab[counter] = denne.getElement();
			counter++;
			} 
			denne = denne.getNeste();
		}
		
		return trimTab(hjelpeTab, counter);
		
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		
		Film [] hjelpeTab = new Film[antall];
		LinearNode <Film> denne = start;
		int counter = 0;
		
		for (int i = 0; i < antall; i++) {
			if(denne.getElement().getProdusent().contains(delstreng)) {
			hjelpeTab[counter] = denne.getElement();
			counter++;
			} 
			denne = denne.getNeste();
		}
		
		
		return trimTab(hjelpeTab, counter);
	}
		
	

	@Override
	public int antall(Sjanger sjanger) {

		LinearNode <Film> denne = start;
		int counter = 0;
		
		for (int i = 0; i < antall; i++) {
			if(denne.getElement().getSjanger().equals(sjanger)) {
				counter++;
			 }
			   denne = denne.getNeste();
		}
		
		
		return counter;
	}

	@Override
	public int antall() {
		return antall;
	}

	
	
}
