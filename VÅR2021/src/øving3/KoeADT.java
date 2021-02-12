package �ving3;

import �ving3.EmptyCollectionException;

public interface KoeADT<T> {

	
    void innKoe (T element);
   
    /**
	 * Legge til et element bak i k�en.
	 * @param element er elementet som blir satt inn i k�en
	 */
    
    T utKoe();

    /**
     * Fjerner og returnerer elementet foran i k�en.
     * @return elementet foran i k�en
     * @exception EmptyCollectionException unntak som kastes hvis k�en er tom
     */
 
  
    T foerste() ;
   
    /**
     * Returnerer elementet foran i k�en uten � fjerne det fra k�en.
     * @return elementet foran i k�en
     * @exception EmptyCollectionException unntak kastes hvis k�en allerede er tom
     */
  
   
    boolean erTom();

    /**
     * Returnerer sann hvis denne k�en ikke inneholder noen elementer.
     * @return sann dersom k�en er tom ellers usann
     */
    
  
    int antall();
  
    /** 
     * Returnerer antall elementer i k�en.
     * @return antall elementer i k�en
     */
}
	

