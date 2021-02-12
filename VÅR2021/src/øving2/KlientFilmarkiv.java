package øving2;

public class KlientFilmarkiv {

	
	public static void main(String[] args) {
		
		FilmArkivADT a = new Filmarkiv(3);
		
		Meny meny = new Meny(a);
		meny.start();
		

	}

}
