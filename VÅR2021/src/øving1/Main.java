package �ving1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {		
		
		String [] navn = new String [2];	
		
		Facebook graf = new Facebook("Navn p� gruppa", navn);
		graf.leggTilVenner("Anton", "Teresa");
		graf.leggTilVenner("Anton", "Martin");
		
		graf.visGraf();
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Sjekk om to personer er venner ved � s�ke p� et navn");
//		String linje = input.nextLine();
//		
//		
//		for (int i = 0; i < navn.length && input.hasNextLine(); i++) {
//			if(graf.erVenner(linje, navn[i])) {
//				System.out.println("De er venner");
//			} else {
//				System.out.println("De er ikke venner");
//		}
		
		

	
	
	}
	
	
		
 }
