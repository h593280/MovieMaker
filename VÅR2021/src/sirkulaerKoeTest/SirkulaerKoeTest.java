package sirkulaerKoeTest;

import �ving3.KoeADT;
import �ving3.SirkulaerKoe;

public class SirkulaerKoeTest extends SirkulaerKoeADT {

	@Override
	protected KoeADT <Integer> reset() {
		return new SirkulaerKoe <Integer>();
	}		
	
}
