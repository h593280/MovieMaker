package øving3;

import øving3.KoeADT;   
import øving3.EmptyCollectionException;

public class KjedetKoe<T> implements KoeADT<T> {

	private int antall; //antall elementer
	private LinearNode<T> foran; //referanse til første node
	private LinearNode<T> bak; // referanse til siste node, null
	

	/******************************************************************
	 * Oppretter en tom kø.
	 ******************************************************************/
	public KjedetKoe() {
		antall = 0;
		foran = bak = null;
	}

	/******************************************************************
	 * Legger inn et spesifisert element i køen.
	 ******************************************************************/
	public void innKoe(T element) {
		LinearNode<T> nyNode = new LinearNode<T>(element);
		
		if(antall == 0) {
		bak = nyNode;
		foran = nyNode;
		antall++;
		
		} else {
			bak.setNeste(nyNode);
			bak = nyNode;
			antall++;
		}
	}

	/******************************************************************
	 * Fjerner og returnerer elementet foran i køen.
	 ******************************************************************/
	public T utKoe() {
		if (erTom())
			throw new EmptyCollectionException("koe");
		
		T result = foran.getElement();
		
		foran = foran.getNeste();
		
		antall--;
		
		
		return result;
		
	}

	/******************************************************************
	 * Returnerer elementet foran i køen ute å fjerne det.
	 ******************************************************************/
	public T foerste() {
		if (erTom())
			throw new EmptyCollectionException("koe");

		T result = foran.getElement();
		
		
		return result;
		
	}

	/******************************************************************
	 * Returnerer sann hvis køen er tom, usann ellers.
	 ******************************************************************/
	public boolean erTom() {
		return (antall == 0);
	}

	/******************************************************************
	 * Returnerer antall elementer i køen.
	 ******************************************************************/
	public int antall() {
		return antall;
	}

	/******************************************************************
	 * Returnerer en strengrepresentasjon av elementene i køen.
	 ******************************************************************/
	public String toString() {
		String resultat = "";
		LinearNode<T> aktuell = foran;

		while (aktuell != null) {
			resultat = resultat + (aktuell.getElement()).toString() + "\n";
			aktuell = aktuell.getNeste();
		}

		return resultat;
	}
	
}
