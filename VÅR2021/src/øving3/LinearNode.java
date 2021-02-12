package øving3;

public class LinearNode<T> {

	private LinearNode <T> neste;
	private T element;
	
	//opretter en tom node
	public LinearNode() {
	neste = null; 
	element = null;
	}
	
	//opprette en node med et element
	public LinearNode(T element) {
		neste = null;
		this.element = element;
	}
	
	//returnerer etterfølger
	public LinearNode<T> getNeste(){
	return neste;	
	}
	
	//setter neste til node
	public void setNeste(LinearNode<T> node) {
		neste = node;
	}
	
	//returnerer elementet til denne noden
	public T getElement() {
		return element;
	}
	
	//setter nytt element i denne noden
	public void setElement(T element) {
		this.element = element;
	}
	
	
}
