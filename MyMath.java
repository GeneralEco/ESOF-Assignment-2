package program;
/**
 * @authors Matthew Gober, Lizzy Hamaoka 
 * September 17,2018
 * ESOF 322 - Assignment 2	
 *
 *Bubble Sort Class from older class project by Lizzy
 */
public class MyMath implements MathSort {

	
	/* Compares temp entity to the rest of the array and moves it forward if necissary until the whole array
	 * has been run through and sorted smallest to largest */
	@Override
	public void MyMathSort(int iArray[]) {
		this.PrintArray(iArray);//prints array before
		int n = iArray.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (iArray[j] > iArray[j+1]) {
                    temp = iArray[j];
                    iArray[j] = iArray[j+1];
                    iArray[j+1] = temp;
                }///end if
	}//end inner for loop
        
   }//end outer for loop
        this.PrintArray(iArray);//prints array after
	}
}
           