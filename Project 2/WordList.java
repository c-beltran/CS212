/**
 * LinkedList Class which contains
 * a getLength method, append method
 * toString method, and insert method
 * @author Carlos
 *
 */
public class WordList {
	/** First node in linked list - dummy node */	
	private WordNode first = new WordNode(null);
	/** Last node in linked list */
	private WordNode last = first;
	/** Number of data items in the list. */
	private int length = 0;
	
	/**
	 * Gets the number of data values currently stored in this LinkedList.
	 * @return the number of elements in the list.
	 */
	public int getLength() {
		return length; //returns size of linklist
	}
	
	/**
	 * Appends a String data element to this LinkedList.
	 * @param data the data element to be appended.
	 */
	public void append(Word data){
		WordNode ln = new WordNode(data);
		last.next = ln;
		last = ln;
		length++;
	}
	
	/**
	 * String representation of elements in linked list delimited by a
	 * space character
	 * @return
	 */
	public String toString() {
		// create p to check through list.
		WordNode p = first.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data + " \n";
			p = p.next; 
		}
		return returnString;
	}
	
	/**
	 * will add the node in the proper position to 
	 * keep the list sorted in order by Word.
	 * @param x
	 */
	public void insert( Word x){
		WordNode a,b;
		a = first;
		b = a.next;
		WordNode in = new WordNode(x);
		
		while(b !=null && b.data.compareTo(x) <= 0){
			a = a.next;
			b = b.next;
		}
		in.next = b;
		a.next = in; 
	}
	
}
	