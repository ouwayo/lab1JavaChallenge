package PartC;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the text/word to reverse: ");
		String text=input.nextLine(); 
		
		for(int i=text.length()-1; i>=0;i--) {
			System.out.print(text.charAt(i));
			
		}
		
		
	}

}
