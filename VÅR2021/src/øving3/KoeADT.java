package øving3;

import øving3.EmptyCollectionException;

public interface KoeADT<T> {

	
    void innKoe (T element);
   
    /**
	 * Legge til et element bak i køen.
	 * @param element er elementet som blir satt inn i køen
	 */
    
    T utKoe();

    /**
     * Fjerner og returnerer elementet foran i køen.
     * @return elementet foran i køen
     * @exception EmptyCollectionException unntak som kastes hvis køen er tom
     */
 
  
    T foerste() ;
   
    /**
     * Returnerer elementet foran i køen uten å fjerne det fra køen.
     * @return elementet foran i køen
     * @exception EmptyCollectionException unntak kastes hvis køen allerede er tom
     */
  
   
    boolean erTom();

    /**
     * Returnerer sann hvis denne køen ikke inneholder noen elementer.
     * @return sann dersom køen er tom ellers usann
     */
    
  
    int antall();
  
    /** 
     * Returnerer antall elementer i køen.
     * @return antall elementer i køen
     */
}
	

