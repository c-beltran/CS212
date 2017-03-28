/**
 * Carlos Alberto 							Lab Sec.: B
 * 
 * This project will represent OOP by creating one main class
 * and two other classes that will respond to the main class.
 * 
 * 1. Create a class called Word which has a Static Value equal
 * to three, an instance variable that contains a String to 
 * represent the word, and a constructor that takes a single
 * parameter.
 * 2. Read words from a file into an array form the file and 
 * display them in a GUI that should have a GridLayout with 
 * one row and two columns. 
 * 3. Use selection sort to for the words in a alphabetical list.
 * 4. check that the value read is legal (3letters) if not legal
 * print words to the console.
 * 5.use string tokenizer to separate the individual words.
 */


import java.util.StringTokenizer;

public class Project1 {
	//reads the file where the words are stored
	public static String filename = "words.txt";
	
	public static void main(String[] args){
		String[] myArray = new String[100];
		String[] myArray2 = new String[100];
		inputFromFile(filename, myArray2);
		//keeps count on how many words are stored in the .txt file
		int count =  inputFromFile(filename, myArray);	
		//sorts myArray2 in alphabetical order
		selectionSort(myArray2, count);
		//put after sorted and unsorted array ( , )
		WordGui gui = new WordGui(myArray, myArray2, count);
		
	}
	//reads the .txt file and tokenizes the words
	public static int inputFromFile(String filename, String[] myArray){
		TextFileInput in = new TextFileInput(filename);
		int lengthFilled = 0;
		String line = in.readLine();
		while (line != null ) {
			StringTokenizer st = new StringTokenizer(line, ",");
			while(st.hasMoreTokens()) {
				//temp = temporary place holder for words
				String temp = st.nextToken();
				//this if statement checks if the word is valid. The method is stored in Word.java class
				if((Word.isValid(temp))){
					myArray[lengthFilled]= temp;
					lengthFilled++;
				}else//print to console if not valid
					System.out.println(temp);
			}//end of second while
			line = in.readLine();
		} // end of first while 
		in.close();
		//return lengthFilled; 
		return lengthFilled;
	}  // method inputFromFile
	
	//selection sort algorithm
	private static void selectionSort(String[] array, int length) { 
		for ( int i = 0; i < length - 1; i++ ) { 
			int indexLowest = i; 
		    	for ( int j = i + 1; j < length; j++ ) 
		    		if ( array[j].compareTo(array[indexLowest]) < 0 ) 
						indexLowest = j;
		      
		    	if ( array[indexLowest] != array[i] ) { 
		    		String temp = array[indexLowest];
		    		array[indexLowest] = array[i]; 
		    		array[i] = temp; 
		    	}// if
		} // for i 
	} // method selectionSort 
}// Project1
