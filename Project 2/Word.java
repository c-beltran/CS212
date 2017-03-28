/**
 * Word Class will convert string to variable word,
 * compare strings, convert variable word to string,
 * check if the length of the word is valid, and
 * and check if the the characters of the word are valid.
 * 
 * @author Carlos
 *
 */

public class Word {
	//static variable
	static final int WORD_SIZE = 3;
	//instance variable
	String word;
	
	/** constructor, w is for word class
	 * 
	 * @param w
	 */
	public Word(String w){
		this.word = w;
	}//Word
	
	/**
	 * This method overrides the toString() method to display words
	 * 
	 */
	public String toString(){ 
		  return word + "";  
	}//toString
	
	/**
	 * This compareTo method accepts a Word variable and compares two strings
	 * @param w
	 * @return string comparison
	 */
	public int compareTo(Word w){ 
		   return word.compareTo(w.word);
	} //compareTo
	
	/** 
	 * method isValid checks if the tokenized word length 
	 * is valid and not greater or less than 3
	 * @param temp
	 * @return boolean statement true/false
	 */
	public static boolean isValid(String temp){
		//temp is carried from Project1
		if(temp.length() == WORD_SIZE && wordIsValid(temp)){
			return true;
		}else return false;
	}//isvalid
	
	/**
	 * WordIsValid method checks if each char is a letter
	 * @param temp
	 * @return boolean statement true/false
	 */
	public static boolean wordIsValid(String temp){
		for(int i=0; i<temp.length(); i++){
			if (!(Character.isLetter(temp.charAt(i)))) return false;
		}
		return true;		
	}
}//wordIsValid
