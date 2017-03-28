/**
 * WordNode class creates nodes for LinkedList Class
 * @author Carlos
 *
 */
public class WordNode {
	/**instance variables set to protected
	 * we use protected because we can't
	 * inherit in private variables 
	 * 
	 */
	protected Word data;
	protected WordNode next;
	
	/**
	 * one argument constructor 
	 * that takes a variable
	 * Word as a parameter
	 * @param w
	 */
	public WordNode(Word w){
		data = w;
	}// WordNode constructor
}// class WordNode

