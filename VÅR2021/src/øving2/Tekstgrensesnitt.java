package øving2;

import java.util.Scanner;

public class Tekstgrensesnitt {
		
	public Film lesFilm() {
		
		Scanner tast = new Scanner(System.in);
		
		System.out.println("Skriv inn filmnr: \n" );
		int filmnr = tast.nextInt();
		
		System.out.println("Skriv inn produsent: \n ");
		String produsent = tast.next();
		
		System.out.println("Skriv inn tittel: \n");
		String tittel = tast.next();
		
		System.out.println("Skriv inn år: \n");
		int år = tast.nextInt();
		
		System.out.println("Skriv inn en sjanger: \n");
		Sjanger sjanger = Sjanger.finnSjanger(tast.next());
		
		System.out.println("Skriv inn filmselskap: \n");
		String filmselskap = tast.next();
		
		Film nyFilm = new Film(filmnr, produsent, tittel, år, sjanger, filmselskap);
		
		return nyFilm;
		
	}
	
	public void visFilm(Film film) {
		System.out.println(film.toString());
	}
	
	public void skrivUtFilmDelstrengTittel(FilmArkivADT filma, String delstreng) {
		
		
		for (Film x: filma.soekTittel(delstreng)) {
			visFilm(x);
		}
		
		
	}
	
	public void skrivUtFilmProdusent(FilmArkivADT filma, String delstreng) {
		
		for(Film x: filma.soekProdusent(delstreng)) {
			visFilm(x);
			
		}
	}
	
	public void skrivUtStatistikk(FilmArkivADT filma) {
		
		int antall = filma.antall();
		
		int action = filma.antall(Sjanger.ACTION);
		int drama = filma.antall(Sjanger.DRAMA);
		int history = filma.antall(Sjanger.HISTORY);
		int scifi = filma.antall(Sjanger.SCIFI);
		
		System.out.println("antall filmer totalt: " + antall);
		
		System.out.println("hvor mange i hver action " + action);
		System.out.println("hvor mange i hver drama: " + drama);
		System.out.println("hvor mange i hver history: " + history);
		System.out.println("hvor mange i hver scifi: " + scifi);
		
	}
	
}
