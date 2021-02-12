package øving2;

import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;


public class Fil {


//les et Filmarkiv fra tekstfil
public static void LesFraFil(FilmArkivADT filmarkiv, String filnavn) throws FileNotFoundException {
	
	final String SKILLE = "#";
	filnavn = "bruh.txt";
	
	try {
		
		FileReader filmFil = new FileReader(filnavn);
		BufferedReader innfil = new BufferedReader(filmFil);
		
		//leser første linje
		String linje = innfil.readLine();
		int antall = Integer.parseInt(linje);
		
		Filmarkiv filmer = new Filmarkiv(antall);
		
		String film = innfil.readLine();
		for (int i = 0; i < antall; i++) {
			
			String [] felt = film.split(SKILLE);
			
			int filmnr = Integer.parseInt(felt[0]);
			String produsent = felt[1];
			String tittel = felt[2];
			int år = Integer.parseInt(felt[3]);
			Sjanger sjanger =  Sjanger.finnSjanger(felt[4]);
			String filmselskap = felt[5];
			
			Film nyFilm = new Film(filmnr, produsent, tittel, år, sjanger, filmselskap);
			filmer.leggTilFilm(nyFilm);
			
			film = innfil.readLine();
			System.out.println(nyFilm.toString());
		}
		
		innfil.close();
		}
	
	catch(FileNotFoundException e) {
		System.out.println("Finner ikke filen " + filnavn);
		System.exit(1);
	}
	
	catch (IOException e) {
		System.out.println("Feil ved lesing av fil " + e);
		System.exit(2);
	}

}

// endre evt
public static FilmArkivADT lesFraFil(String filnavn) throws FileNotFoundException {
	
	final String SKILLE = "#";
	filnavn = "bruh.txt";
	
	try { 
	FileReader file = new FileReader(filnavn);
	BufferedReader innfil = new BufferedReader(file);
	
	//leser første linje
	String linje = innfil.readLine();
	int antall = Integer.parseInt(linje);
	
	FilmArkivADT filmer = new Filmarkiv(antall);
	
	String film = innfil.readLine();
	for (int i = 0; i < antall; i++) {
		
		String [] felt = film.split(SKILLE);
		
		int filmnr = Integer.parseInt(felt[0]);
		String produsent = felt[1];
		String tittel = felt[2];
		int år = Integer.parseInt(felt[3]);
		Sjanger sjanger =  Sjanger.finnSjanger(felt[4]);
		String filmselskap = felt[5];
		
		Film nyFilm = new Film(filmnr, produsent, tittel, år, sjanger, filmselskap);
		filmer.leggTilFilm(nyFilm);
		
		film = innfil.readLine();
		System.out.println(nyFilm.toString());
	
	return filmer;
	
	}
	innfil.close();
}

catch(IOException e) {
		System.out.println("Filen finnes ikke: " + e);
 }
	return null;
}


public static void skrivTilFil(FilmArkivADT filmarkiv, String filnavn) {
	
	final String SKILLE = "#";
	final String filNavn = "bruh.txt";
	
	int antall = filmarkiv.antall();
	
	try {
		PrintWriter utfil = new PrintWriter(filnavn);
		
		utfil.println(antall);
		
		for (int i = 0; i < antall; i++) {
			utfil.print(filmarkiv.hentFilmTabell()[i].getFilmnr()); utfil.print(SKILLE);
			utfil.print(filmarkiv.hentFilmTabell()[i].getProdusent()); utfil.print(SKILLE);
			utfil.print(filmarkiv.hentFilmTabell()[i].getTittel()); utfil.print(SKILLE);
			utfil.print(filmarkiv.hentFilmTabell()[i].getÅr()); utfil.print(SKILLE);
			utfil.print(filmarkiv.hentFilmTabell()[i].getSjanger()); utfil.print(SKILLE);
			utfil.println(filmarkiv.hentFilmTabell()[i].getFilmselskap()); 
		}
		
		
		utfil.close();
	}
	
	catch(IOException e) {
		System.out.println("Feil ved skriving til fil :" + e);
		System.exit(3);
	}
}




}
