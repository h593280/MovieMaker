package kjedeKoeTest;

import �ving3.KoeADT; 
import �ving3.KjedetKoe;

public class KjedeKoeTest extends KjedetKoeADT {

	@Override
	protected KoeADT <Integer> reset(){
		return new KjedetKoe <Integer>();
	}		
	
}
