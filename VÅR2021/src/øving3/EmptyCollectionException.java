package øving3;

public class EmptyCollectionException extends RuntimeException {

	//********************************************************************
//  EmptyCollectionException.java   //
//  Representerer situasjonen når samlingen er tom.
//********************************************************************
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

/******************************************************************
     Setter opp dette unntaket med passende melding.
   ******************************************************************/
   public EmptyCollectionException (String samling){
      super (" Denne " + samling + " er tom.");
   }
	
}
