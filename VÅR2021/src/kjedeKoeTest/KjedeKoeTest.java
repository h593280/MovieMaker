package kjedeKoeTest;

import øving3.KoeADT; 
import øving3.KjedetKoe;

public class KjedeKoeTest extends KjedetKoeADT {

	@Override
	protected KoeADT <Integer> reset(){
		return new KjedetKoe <Integer>();
	}		
	
}
