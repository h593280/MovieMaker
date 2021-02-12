package øving3;

import øving3.KoeADT;

import java.util.Arrays;

import øving3.EmptyCollectionException;

public class SirkulaerKoe <T> implements KoeADT<T> {

	private final static int STDK = 100;
	private int foran, bak, antall;
	private T[] koe;

	public SirkulaerKoe() {
		this(STDK);
	}

	//
	public SirkulaerKoe(int startKapasitet) {
		foran = bak = antall = 0;
		koe = ((T[]) (new Object[startKapasitet]));
	}

	public void innKoe(T element) {
		//sjekker om den er full
		if (antall == koe.length) {
			utvid();

		}
		
		//bak er indeks plassen til elementet som skal legges til, bak == null
		koe[bak] = element;
		//oppdatere bak ved innsetting
		bak = (bak+1) % koe.length;
		antall++;
		
	}

	public T utKoe()  {
		if (erTom())
			throw new EmptyCollectionException("koe");

	  T resultat = koe[foran];
	  koe[foran] = null;
	  foran = (foran + 1) % koe.length;
	  antall--;
		
		return resultat;
	}

	public T foerste()  {
		if (erTom())
			throw new EmptyCollectionException("koe");
		
		T resultat = koe[foran];
		return resultat;
	}

	public boolean erTom() {
		return (antall == 0);
	}

	public int antall() {
		return antall;
	}

	private void utvid() {
		T[] hjelpetabell = (T[]) (new Object[koe.length * 2]);
		
		for (int i = 0; i < antall; i++) {
			hjelpetabell[i] = koe[foran];
			foran = (foran + 1) % koe.length;
		}
		
		foran = 0;
		bak = antall;
		koe = hjelpetabell;
		
	}

	@Override
	public String toString() {
		return "SirkulaerKoe [foran=" + foran + ", bak=" + bak + ", antall=" + antall + ", koe=" + Arrays.toString(koe)
				+ "]";
	}
	
}
