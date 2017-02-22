
/*
This program is intended to do the following:
1. Ask the user to type in a sentence, using a JOptionPane.showInputDialog().
2. The program will examine each letter in the string and count how many time the 
upper-case letter 'E' appears, and how many times the lower-case letter 'e' appears. 
The key here is to use the charAt method in class String.
3. Using a JOptionPane.showMessageDialog(), tell the user how many upper and lower
case e's were in the string.
4. Repeat this process until the user types the word "Stop". (Check out the method
equalsIgnoreCase in class String to cover all upper/lower case possibilities of the word "STOP").
*/


import javax.swing.*;

public class Project0{
	//create string method named RadSentence
	public static String ReadSentence(){
		String sentence;
			//set sentence equal to JOptionPane to store user input, request in a dialog box user input
			sentence = JOptionPane.showInputDialog(null, "Enter a sentence:");
			//return user input if user enters a valid sentence and not "STOP". 
			return sentence;
	}
	
	public static void main(String[] args){
		
		int uppercase = 0, lowercase=0;
		String userinput;
		//utilize a while loop to check for user input error
		while(true){
			//set string data type equal to method created (if something is returned from the method it will now
			// be stored in userinput).
			userinput= ReadSentence();
			//create if statement and use .equalsIgnoreCase to avoid errors when user types "STOP"
			if (userinput.equalsIgnoreCase("STOP")){
				//if user enters "STOP" the dialog box will output "finito"(translates to finish in spanish)
				JOptionPane.showMessageDialog(null,"Finito :D");
				System.exit(0);
			}
			//create a for loop using .length() in order to read each element of the user input
			for(int i=0; i<userinput.length(); i++){
				//if statment using .charAt(int) in order to check if an element of the user equals to char'E'
				if(userinput.charAt(i)=='E'){
					//if an upper case E is found, add 1 to uppercase to keep count until for loop ends
					uppercase++;
				}
				if(userinput.charAt(i)=='e'){
					lowercase++;
				}
			}
			//output in a dialog box the result of the numbes of E's and e's that user typed in sentence.
			JOptionPane.showMessageDialog(null, "Number of upper case E's: " + uppercase +"\n"+"Number of lower case case e's: "+ lowercase);
		}
	}
}
