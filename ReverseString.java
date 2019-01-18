package PartC;
import java.util.*;
/**
 * 
 * @author oscar & Oswald
 *
 */
public class ReverseString {

	public static void main(String[] args) {
		// ask user to input a text. 
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the text/word to reverse: ");
		String text=input.nextLine(); 
		
		String output=" "; 
		
		/**
		 * In case user enters a long text, we should be able to reverse a word by word. 
		 * So, let's split the text according to space and put them in the array. 
		 */
		String[] parts=text.split(" ");
		
		/**
		 * Nested loop, one for is the general array of words, whereas the other for is for the indiviadual word. 
		 * Incase user entered a combination of words. 
		 */
		for(int i=0; i< parts.length;i++) {
			
			for(int k=parts[i].length()-1;k>=0;k-- ) {
				
				output= output+ parts[i].charAt(k); 
			}
		// we should be able to view the reversed text as it was given before. 
			output= output+" "; 
		}
		System.out.print("The reversed is :"+output);
			
	}

}
