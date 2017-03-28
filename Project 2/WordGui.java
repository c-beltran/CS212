/**
 *WordGui Class will display the result
 * of the unsorted and sorted list passed
 * from project 1 class
 */

import java.awt.GridLayout;
import javax.swing.*;        

public class WordGui {
	
	//create instance variables, 
	String word;
		
	/**
	 * create constructor to accept 2 LinkedLists from project1
	 * @param listOne
	 * @param listTwo
	 */
	public WordGui(WordList listOne, WordList listTwo){
		//sends linkedLists to method
		createAndShowGUI(listOne, listTwo);
	}
   /**
    * createAndShowGUI method displays the sorted and unsorted list 
    * @param unsortList
    * @param sortedList
    */
   private static void createAndShowGUI(WordList unsortList, WordList sortedList) {
        //Create and set up the window.
        JFrame frame = new JFrame("Project1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize( 100,100);//width, height);
        frame.setLocation(200,200);//x, y);
        frame.setLayout(new GridLayout(1,2));//1=row 2=col

        JTextArea textArea = new JTextArea(5, 20);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane);
        
        textArea.setText("Unsorted: "+"\n");
        //loop to go through the array and display the unsorted list
        
		textArea.append(unsortList + "");			
		
        JTextArea textArea2 = new JTextArea(5, 20);
        textArea2.setEditable(false);
        frame.getContentPane().add(textArea2);
        textArea2.setText("Sorted: "+"\n");
        //loop to go through the array and display the sorted list
        
		textArea2.append(sortedList + "");			
		
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
        //readAndDisplayMatrix(frame, textArea, textArea2); //label);
    }//createAndShowGUI	        
}//WordGui class