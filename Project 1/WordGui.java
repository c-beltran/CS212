
import java.awt.GridLayout;
import javax.swing.*;        

public class WordGui {
	
	//create 2 instance variables, 
	String word;
	//String 
	
	//create constructor to accept 2 arrays wordgui from project1
	public WordGui(String[] arrayOne, String[] arrayTwo, int sizeOfArray){
		
		createAndShowGUI(arrayOne, arrayTwo, sizeOfArray);
	}
    //call this here! createAndShowGUI();
   
   private static void createAndShowGUI(String[] unsortList, String[] sortedList, int size) {
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
        for(int i=0; i<size; i++) {
			textArea.append(unsortList[i] + "\n");			
		}
        JTextArea textArea2 = new JTextArea(5, 20);
        textArea2.setEditable(false);
        frame.getContentPane().add(textArea2);
        textArea2.setText("Sorted: "+"\n");
        //loop to go through the array and display the sorted list
        for(int i=0; i<size; i++) {
			textArea2.append(sortedList[i] + "\n");			
		}
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
        //readAndDisplayMatrix(frame, textArea, textArea2); //label);
    }	

        
}