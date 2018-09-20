package program;
import java.util.Scanner;
/**
 * @authors Matthew Gober, Lizzy Hamaoka 
 * September 17,2018
 * ESOF 322 - Assignment 2	
 *
 *Main class that uses the MathSort interface to do 3 sort methods.
 */
public class Main {

	
	public static void main(String[] args) {
		int choice = 99;
		Scanner s = new Scanner(System.in);
		
		while(choice != 0) {
			System.out.println("Please select a choice: 1) MTool 2) MyMath 3) Mathematica 0) Quit");
			choice = Integer.parseInt(s.nextLine());
			
			switch (choice) {
				case 0: System.out.println("Quitting...\n");
					break;
				case 1: System.out.println("MTool selected...\n");
					break;
				case 2: System.out.println("MyMath selected...\n");
					break;
				case 3: System.out.println("Mathematica selected...\n");
					break;
				default: System.out.println("Invalid input. Try again.");
					break;
			}//end switch
			System.out.println("-------------------\nThank you for using MathSort!\n-------------------");
		}//end while
		
		
	}

}
