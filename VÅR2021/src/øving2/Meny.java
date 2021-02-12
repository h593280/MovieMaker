package øving2;

import java.io.FileNotFoundException; 
import java.util.Scanner;

public class Meny {

	private Tekstgrensesnitt tekstgr;
	private FilmArkivADT filma;
	
	public Meny(FilmArkivADT filma) {
		tekstgr = new Tekstgrensesnitt();
		this.filma = filma;
	}
	
	
	public void start() {
		

		System.out.println("MENY");
		System.out.println();
		
		
		Scanner tast = new Scanner(System.in);
		
		System.out.println("Tast 1 for legge til film og skriv til Fil");
		System.out.println("Tast 2 for å les fra filen som ble lagt");
		System.out.println("Tast 3 for søk tittel");
		System.out.println("Tast 4 for søk produsent");
		System.out.println("Tast 5 for a slette et filmnr");
		System.out.println("Tast 6 for skriv ut jævlig statetstikk ");
		System.out.println("Tast et annet nummer for å avslutte");
		
		int valg = tast.nextInt();
		if(valg == 1) {
				
		filma.leggTilFilm(tekstgr.lesFilm());
		Fil.skrivTilFil(filma, "bruh.txt");
	
		start();
		
		} else if (valg == 2) {
		
			try {
				Fil.LesFraFil(filma, "bruh.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		
		start();		
			
		} else if(valg == 3) {
			
			
			System.out.println("Skriv ka du vil søk: ");
			tast.nextLine();
			String tittel = tast.nextLine();
			tekstgr.skrivUtFilmDelstrengTittel(filma, tittel);
		
			start();
			
		}  else if(valg == 4) {
			
			
			System.out.println("Skriv ka du vil søk: ");
			tast.nextLine();
			String produsent = tast.nextLine();
			tekstgr.skrivUtFilmProdusent(filma, produsent);
		
			start();
		} else if(valg == 5) {
			
			System.out.println("Koss filmnr vil du slett: ");
			int input = tast.nextInt();
			System.out.println(filma.slettFilm(input));
			start();
			
		} else if (valg == 6) {
		
			tekstgr.skrivUtStatistikk(filma);
			start();
		}
		
		else {
			System.out.println("Ha en fin dag videre!");
			System.exit(0);
		}
		
		
		
	
	
		
	
	}
	
}
