package øving1;

import java.util.*;

public interface Graf {

	int getAntallNoder();
	
	int getAntallKanter();
	
	List<String> alleNoder();
	
	boolean erNaboer(String u, String v);
	
	boolean leggTilNode(String w);
	
	boolean leggTilKant(String u, String v);
	
	boolean leggTilKanter(String w, String [] naboer);
	
	boolean fjern(String u , String v);
		
	}

