package program;
/**
 * @authors Matthew Gober, Lizzy Hamaoka 
 * September 17,2018
 * ESOF 322 - Assignment 2	
 *
 *Bubble Sort Class
 */
public class MyMath implements MathSort {

	@Override
	public void MyMath(int iArray[]) {
		
		int n = iArray.length;
        int temp = 0;

        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < n-i-1; j++) {
                if (iArray[j] > iArray[j+1]) {
                    temp = iArray[j];
                    iArray[j] = iArray[j+1];
                    iArray[j+1] = temp;
                }
	}
        
   }
	}
}
           