package øving1;

import java.util.*;
 
public class Nabomatrise implements Graf {

	private int n;
	private int m; 
	private boolean [][] matrise;
	
	
	private HashMap <String, Integer> nodenavn;
	private String [] navn;

	
	
	public Nabomatrise(String[] navnPaaNoder) {
		//treng ikke lage ny tabell, må bare ha referansen. 
		navn = navnPaaNoder;
		n = navnPaaNoder.length;
		m = 0;
		matrise = new boolean [n][n];
		
		// mer effektiv ved å angi størrelsen i konstruktøren 
		HashMap <String,Integer> nodenavn = new HashMap <>();
		for (int i = 0; i < n; i++) {
			nodenavn.put(navn[i], i);
		}
	}
	
	@Override
	public int getAntallNoder() {
		return n;
	}
	@Override
	public int getAntallKanter() {
		return m;
	}
	@Override
	public List<String> alleNoder() {
		
		//oprette liste
		ArrayList<String> listeNavn = new ArrayList<>();
		
	
	for (String x: navn) {
		listeNavn.add(x);
	}
			return listeNavn;
		}
		
	
	
		
	@Override
	public boolean erNaboer(String u, String v) {
	return matrise[nodenavn.get(u)][nodenavn.get(v)];
	}
	
	@Override
	public boolean leggTilNode(String w) {
		boolean plass = false;	
		if(!nodenavn.containsKey(w)) {
				nodenavn.put(w, n+1);
				plass = true;
		}
		return plass;
	}
		
	
	@Override
	public boolean leggTilKant(String u, String v) {

		if(!erNaboer(u, v)) {
			matrise[nodenavn.get(u)][nodenavn.get(v)] = true;
			matrise[nodenavn.get(v)][nodenavn.get(u)] = true;
			m++;
			return true;
		}
		
		return false;
	}
	@Override
	public boolean leggTilKanter(String w, String[] naboer) {
		
		for (int i = 0; i < naboer.length; i++) {
			if((!erNaboer(w, naboer[i])) && m == 0) {
				matrise[nodenavn.get(w)][nodenavn.get(naboer[i])] = true;
				m++;
				return true;
			} 
		}
		return false;
	}
	@Override
	public boolean fjern(String u, String v) {
	
		if(erNaboer(u, v)) {
			matrise[nodenavn.get(u)][nodenavn.get(v)] = false;
			matrise[nodenavn.get(v)][nodenavn.get(u)] = false;
			m--;
			return true;
		}
		return false;
	}
	
	public List<String> getNaboer(String w){
		
		List<String> listeNaboer = new ArrayList<>();
	
		for(String x: navn) {
			if(erNaboer(w, x)) {
				listeNaboer.add(x);
			}
		}
		
		return listeNaboer;
	}
	
}