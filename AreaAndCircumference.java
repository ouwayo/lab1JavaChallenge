package PartC;
import java.util.*;
/**
 * 
 * @author oscar & Oswald. 
 *
 */

public class AreaAndCircumference {

	public static void main(String[] args) {
		/*
		 * The message to ask user to input area. 
		 */
		System.out.println("Enter the radius of the circle:");
		Scanner input=new Scanner(System.in);
		double radius=input.nextDouble();
		
		double circumference= 2*Math.PI*radius; 
		double area= Math.PI*(radius*radius); 
		
		System.out.printf("Area: %.2f \n",area);
		System.out.printf("Circumference:%.2f \n",circumference);
		
		

	}

}
