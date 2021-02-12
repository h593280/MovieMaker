package sirkulaerKoeTest;

import øving3.KoeADT;
import øving3.SirkulaerKoe;

public class SirkulaerKoeTest extends SirkulaerKoeADT {

	@Override
	protected KoeADT <Integer> reset() {
		return new SirkulaerKoe <Integer>();
	}		
	
}
