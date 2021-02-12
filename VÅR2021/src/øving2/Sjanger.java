package øving2;

public enum Sjanger {

//Objekter
ACTION, DRAMA, HISTORY, SCIFI;

	
	

	public static Sjanger finnSjanger(String navn) {
		Sjanger sjang = null;
		//sjanger.values() gir en tabell med referanse til enum-objektene
		for (Sjanger sj : Sjanger.values()) {
			if (sj.toString().equals(navn.toUpperCase())) {
				sjang = sj;
				break;
			}

		}
		return sjang;

	}





}