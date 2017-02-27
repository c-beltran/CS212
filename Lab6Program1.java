/* 
In this program we want it to read from a txt file that 
contains a list of number. Once the text file is read 
the program needs to compute the sum and the average.
once thats done program must output the answers in a 
message box. 
-use TextFileInput.java for lab 6 when compiling file
*/


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.*;

public class Lab6Program1 {

	public static void main(String[] args) {
		//creates an array of numbers up to 100
		int[] numArray = new int [100];
		//new argurment to read TextFileInput.class
		String filename = args[0];
		//counter to keep count of how many inputs the file has
		int count = inputFromFile(filename, numArray);
		
		int totalSum = sum(numArray, count);

		int avg = average(totalSum, count);
		
		JOptionPane.showMessageDialog(null,"The sum is:" + totalSum + "\n" + "The average is: "+avg);
	} //main

	private static int inputFromFile(String filename, int[] numbers){
      TextFileInput in = new TextFileInput(filename);
      int lengthFilled = 0;
      String line = in.readLine();
	  
      while ( lengthFilled < numbers.length && line != null ) {
		int n = Integer.parseInt(line);
         numbers[lengthFilled++] = n;
         line = in.readLine();
      } // while 

      if ( line != null ) {
         System.out.println("File contains too many numbers.");
         System.out.println("This program can process only " + numbers.length + " numbers.");
         System.exit(1);
      } // if
      in.close();
      return lengthFilled; 

   }  // method inputFromFile 

   	//function to calculate total sum.
	public static int sum (int[] myArray, int myArraySize){
		int sum=0;
		for(int i=0; i<myArraySize; i++){
			sum += myArray[i];
		}
		return sum;	
	}

	//function to calculate average
	public static int average(int sum, int myArraySize){
		int calculate=0;
		calculate = sum / myArraySize;
		return calculate;
	}

} // class Lab6Program1

































