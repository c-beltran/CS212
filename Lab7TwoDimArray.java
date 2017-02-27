
public class Lab7TwoDimArray {

	public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
	
	public static void main(String[] args) {
		System.out.println("Trial 1:");
		printArray(myArray);
		System.out.println("Trial 2:");
		printArrayEven(myArray);
		System.out.println("Trial 3:");
		int[][] secondArray = fillArray("twodimesion.txt");
		printArray(secondArray);
	}
	private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println("");
		}
	}
	private static void display (int num){
		System.out.print(num+" ");
	}
	private static void printArrayEven(int[][] theArray){
		for(int i=0; i<theArray.length; i++){
			for(int j=0; j<theArray[i].length; j++){
				if(theArray[i][j]%2 == 0){
					display(theArray[i][j]);
				}
				else System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
	public static int[][] fillArray(String myFile){
		
		TextFileInput fileInput = new TextFileInput(myFile);
		String line = fileInput.readLine();
		//read the first line, store to line
		int row = Integer.parseInt(line);
		//converts String line into a number, store number into row
		line=fileInput.readLine();
		//reads the second line
		int col = Integer.parseInt(line);
		//create new 2D array
		int[][] myArray = new int [row][col];
		
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				line=fileInput.readLine();
				myArray[i][j] = Integer.parseInt(line);
			}
		}
		return myArray;	
	}

}

