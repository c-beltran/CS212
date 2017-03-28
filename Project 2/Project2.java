/**
 *  Carlos Alberto 							Lab Sec.: B
 *  
 * For this project we will be using the same code as project one with 
 * couple of exceptions and a few additions which are as follow:
 * 
 * Additions:
 * 1.Use linked lists to store the unsorted and sorted Words.
 * 2.Create a class called WordNode which has fields for the data and next instance variables.
 * 3.Create a LinkedList Class called WordList with attributes as described in class.
 * 4.Include two methods in the WordList Class, append and insert.
 * 5.Submit project as a Javadoc file
 * 
 * Exceptions:
 * 1.Get and Set methods are not allowed
 * 2.Use of Arrays will not be tolerated
 */

import java.util.StringTokenizer;

public class Project2 {
	/**reads the file where the words are stored  
	 */
	public static String filename = "words.txt";
	
	public static void main(String[] args){
		/** generate empty lists
		 */
		WordList myList1 = new WordList();
		WordList myList2 = new WordList();
		
		inputFromFile(filename, myList1, myList2);
		/**passes parameters to WordGui Class */
		WordGui gui = new WordGui(myList1, myList2);
		
	}
	/**reads the .txt file and tokenizes the words
	 * 
	 * @param filename
	 * @param myList1
	 * @param myList2
	 * @return
	 */
	public static int inputFromFile(String filename, WordList myList1, WordList myList2){
		TextFileInput in = new TextFileInput(filename);
		int lengthFilled = 0;
		String line = in.readLine();
		while (line != null ) {
			StringTokenizer st = new StringTokenizer(line, ",");
			while(st.hasMoreTokens()) {
				//temp = temporary place holder for words 
				String temp = st.nextToken();
				//create a variable "t" that takes a String to convert to Word
				Word t = new Word(temp);
				//this if statement checks if the word is valid. The method is stored in Word.java class 
				if((Word.isValid(temp))){
					//references to the WordList Class to append and insert word
					myList1.append(t);
					myList2.insert(t);
					lengthFilled++;
				}else//print to console if not valid 
					System.out.println(temp);
			}//end of second while
			line = in.readLine();
		} // end of first while 
		in.close(); 
		return lengthFilled;
	}  // method inputFromFile
}//class Project2
