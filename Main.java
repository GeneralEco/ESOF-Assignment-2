package program;
import java.util.Random;
import java.util.Scanner;
/**
 * @authors Matthew Gober, Lizzy Hamaoka 
 * September 17,2018
 * ESOF 322 - Assignment 2	
 *
 *Main class that uses the MathSort interface to do 3 sort methods.
 *Sorting methods where from either previous class projects (like the MyMath bubble sort) or referenced from
 *geeksforgeeks.com
 *MTool sorting method was from http://www.cburch.com/csbsju/cs/160/notes/29/2.html	
 */
public class Main {

	
	public static void main(String[] args) {
		//Initialization of interfaces and variables
		int choice = 99;
		int iArray[] = new int[10];
		int backup[] = new int[10];
		Scanner s = new Scanner(System.in);
		Random randomNum = new Random();
		MathSort mTool = new MTool();
		MathSort myMath = new MyMath();
		MathSort matica = new Mathematica();
		
		//populate array with random ints
		for(int i = 0; i <10; i++) {
			iArray[i] = randomNum.nextInt(100);
		}
		//backup so that main array is not overwritten by sort to be used multiple times
		backup = iArray;
		
		//mian loop where the user can pick between sort methods and try other methods before they decide to quit.
		while(choice != 0) {
			System.out.println("Please select a choice: 1) MTool 2) MyMath 3) Mathematica 0) Quit");
			choice = Integer.parseInt(s.nextLine());
			
			switch (choice) {
			
			//quit
				case 0: System.out.println("Quitting...\n");
					break;
					
			//merge sort class
				case 1: System.out.println("MTool selected: Merge Sort\n");
				//prints array before and after sort then replaces with backup of original
					mTool.PrintArray(iArray);
					mTool.MyMathSort(iArray);
					mTool.PrintArray(iArray);
					iArray = backup;
					break;
					
			//bubble sort class
				case 2: System.out.println("MyMath selected: Bubble Sort\n");
					myMath.MyMathSort(iArray);
					iArray = backup;
					break;
					
			//Insertion sort class
				case 3: System.out.println("Mathematica selected: Insertion Sort\n");
					matica.MyMathSort(iArray);
					iArray = backup;
					break;
					
			//other or default statement
				default: System.out.println("Invalid input. Try again.");
					break;
			}//end switch
			System.out.println("-------------------\nThank you for using MathSort!\n-------------------");
		}//end while
		
		
	}//end main

}//end class