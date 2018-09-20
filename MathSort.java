package program;
/**
 * @authors Matthew Gober, Lizzy Hamaoka 
 * September 17,2018
 * ESOF 322 - Assignment 2	
 *
 *Interface class that will have the sort method modified by each class through an adapter pattern
 */
public interface MathSort {

	public default void MyMathSort(int iArray[]) {
	//inherited sort method modified by each sub class	
	}
	public default void PrintArray(int iArray[]) {
		System.out.println("Printing array...");
		for(int i = 0; i <= iArray.length -1; i++) {
			System.out.print(iArray[i] + ", ");
		}
		System.out.println("\n-------------------------\nPrint complete!");
	}
}
