package øving2;

import java.io.*;

public class MainFil {

	public static void main(String[] args) {

		try {
			String filnavn = "C:\\Users\\Martin Tran\\eclipse-workspace\\VÅR2021\\src\\øving2\\film.txt";
			BufferedReader br = new BufferedReader(new FileReader(filnavn));
	
			
			String linje = br.readLine();
			int antall = Integer.parseInt(linje);
			FilmArkivADT a = new Filmarkiv(antall);
			Fil.skrivTilFil(a, filnavn);
			Fil.LesFraFil(a, filnavn);
				
         	br.close();
		}
		
		catch(Exception e) {
			System.out.println("Finner ikke filen" + e);
		}
		


	}

}
