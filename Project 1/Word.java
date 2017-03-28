
public class Word {
	//static variable
	static final int WORD_SIZE = 3;
	//instance variable
	String word;
	//constructor, w is for word.
	public Word(String w){
		w = word;
	}
	//method to check if the tokenized word is valid
	public static boolean isValid(String temp){
		//temp is carried from Project1
		if(temp.length() == WORD_SIZE && wordIsValid(temp)){
			return true;
		}else return false;
	}//isvalid
	//method to check if each char is a letter
	public static boolean wordIsValid(String temp){
		for(int i=0; i<temp.length(); i++){
			if (!(Character.isLetter(temp.charAt(i)))) return false;
		}
		return true;		
	}//for i
}//wordIsValid
