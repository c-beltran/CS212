import javax.swing.*;

public class Lab3 {
	public static void main(String[] args){
		float fahrenheit, centigrade;
		
		fahrenheit = (float)98.6;
		// to convert fahrenheit to centigrade is c=5/9 (f-32)
		
		centigrade = (float)5/9*(fahrenheit-32);
		
		//System.out.println("The convertion of " + fahrenheit + " degrees fahrenheit to centigrades is " + centigrade);
		System.out.println(" ");
		System.out.println("---------------FOR LOOP EXAMPLE--------------");
		for (float i=0; i<=40.0; i+=5.0){
			fahrenheit = (float) i;
			centigrade = (float)5/9*(fahrenheit-32);
			System.out.println("Fahrenheit: "+fahrenheit+"  \t"+"Centigrade: " +centigrade);
		}
	
		System.out.println(" ");
		System.out.println("--------------WHILE LOOP EXAMPLE-------------");
		float count=0;
		while(count <= 40){
			fahrenheit = count;
			centigrade = (float)5/9*(fahrenheit-32);
			System.out.println("Fahrenheit: "+fahrenheit+"  \t"+"Centigrade: " +centigrade);
			count+=5.0;
		}
	}
}