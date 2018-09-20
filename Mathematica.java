package program;
/**
 * @authors Matthew Gober, Lizzy Hamaoka 
 * September 17,2018
 * ESOF 322 - Assignment 2	
 *
 *Insertion Sort Class
 */
public class Mathematica implements MathSort {
	/*
	 * Insertion sort method that takes the array passed in and sets the current position
	 * and checks to see if any elements are greater, if so it will move that element forward
	 * until it is in place 
	 * */
	@Override
	public void MyMath(int[] iArray) {
		int n = iArray.length;
		int cur;
		int l;
		for (int i = 1; i < n; i++) {
			l = i-1;
			cur = iArray[i];		
			while(l >= 0 && iArray[l] > cur) {
				iArray[l + 1] = iArray[l];
				l = l-1;
			}//nested while loop
			iArray[l+1] = cur;
		}//main for loop
	}//MyMath method

}
