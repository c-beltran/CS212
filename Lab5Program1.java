/*in this project we incorporate a .txt file in our java project
this is then used by the program to read throught the .text file
to check if user input is in the list that the .txt file contains.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.*;

public class Lab5Program1 {

	public static void main(String[] args) {
	
		String[] wordArray = new String[100];
		String isOrIsNot, inputWord;
		String filename = args[0];
		int count = inputFromFile(filename, wordArray);

		// This line asks the user for input by popping out a single window
		// with text input
		
		while(true){
			inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
			if (inputWord.equals("STOP")){
				System.exit(0);
			}
		
			// if the inputWord is contained within wordArray return true
			if (wordIsThere(inputWord, wordArray, count)) 
				isOrIsNot = "is"; // set to is if the word is on the list
			else
				isOrIsNot = "is not"; // set to is not if the word is not on the list
		
			// Output to a JOptionPane window whether the word is on the list or not
			JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
		}
	} //main

	public static boolean wordIsThere(String findMe, String[] theList, int counter) {
		for (int i=0; i<counter; i++){
			if (findMe.equals(theList[i])){
				return true;
			}
		}
		return false;
	} // wordIsThere

	private static int inputFromFile(String filename, String[] words){
      TextFileInput in = new TextFileInput(filename);
      int lengthFilled = 0;
      String line = in.readLine();
      while ( lengthFilled < words.length && line != null ) {
         words[lengthFilled++] = line;
         line = in.readLine();
      } // while 
      if ( line != null ) {
         System.out.println("File contains too many numbers.");
         System.out.println("This program can process only " +
                            words.length + " words.");
         System.exit(1);
      } // if
      in.close();
      return lengthFilled; 
   }  // method inputFromFile 
} // class Lab5Program1

