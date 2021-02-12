package øving1;

import java.util.*;

public class Facebook {

	private String gruppenavn;
	private Nabomatrise g;
	
	
	public Facebook (String navnPaaGruppe, String[] navn) {
		gruppenavn = navnPaaGruppe;
		g = new Nabomatrise(navn);
	}
	
	boolean leggTilVenner(String p1, String p2) {
		return g.leggTilKant(p1, p2);
	}
	
	boolean erVenner(String p1, String p2) {
		return g.erNaboer(p1, p2);
	}
	
	boolean ikkeVenner(String p1, String p2) {
		return g.fjern(p1, p2);
	}
	
	int antallFellesVenner(String p1, String p2) {
		
		List<String> venneListe1 = g.getNaboer(p1);
		List<String> venneListe2 = g.getNaboer(p2);
		
		int counter = 0;
		
		for (int i = 0; i < venneListe1.size(); i++) {
			if(venneListe1.contains(venneListe2.get(i))) {
				counter++;
			}
		}
		

		
		return counter;
	}
	
	 void visGraf() {
		
		//lager 2 lister og sammenligner, tab1[i].compare.tab2[]
	
		int noder = g.getAntallNoder();
		int kanter = g.getAntallKanter();
		
	System.out.println("Facebookgrafen for Deler av DAT102");
	System.out.println("Antall presoner i gruppen = " + noder + ", antall vennskap = " + kanter);
	
	List<String> sad = g.alleNoder();
	
	for (int i = 0; i < sad.size(); i++) {
		System.out.println(sad.get(i) + ": " + g.getNaboer(sad.get(i)).toString());
	}
}

	
}