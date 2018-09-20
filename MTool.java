package program;
/**
 * @authors Matthew Gober, Lizzy Hamaoka 
 * September 17,2018
 * ESOF 322 - Assignment 2	
 *
 *Merge Sort Class
 */
public class MTool implements MathSort {


	@Override
	public void MyMath(int[] iArray) {
//
	
		int l=0;
		int r = iArray.length -1;
		int m = iArray.length /2;
//		int h = iArray.length/2;
//		
//		//two seperate arrays to store half of main array
//		int first[h];
//		int second[h+1];
//		
//		//loops copy and split main array
//		for(i=0; i <= h; i++) {
//			first[i]= iArray[i]; 
//		}
//		for(l = (h+1); l<=iArray.length; l++) {
//			second[l] = iArray[h+l];
//		}
//		
//		i=0;
//		l=0;
		
		    int i, j, k; 
		    int n1 = m - l + 1; 
		    int n2 =  r - m; 

		    /* create temp arrays */
		    int firstArr[n1];
		    int secondArr[n2]; 

		    // Copy data to temp arrays firstArr[] and secondArr[] /
		    for (i = 0; i < n1; i++) 
		        firstArr[i] = iArray[l + i]; 
		    for (j = 0; j < n2; j++) 
		        secondArr[j] = iArray[m + 1+ j]; 

		    // Merge the temp arrays back into iArray[l..r]/
		    i = 0; // Initial index of first subarray 
		    j = 0; // Initial index of second subarray 
		    k = l; // Initial index of merged subarray 
		    while (i < n1 && j < n2) 
		    { 
		        if (firstArr[i] <= secondArr[j]) 
		        { 
		            iArray[k] = firstArr[i]; 
		            i++; 
		        } 
		        else
		        { 
		            iArray[k] = secondArr[j]; 
		            j++; 
		        } 
		        k++; 
		    } 

		    //Copy the remaining elements of firstArr[], if there 
		      // are any /
		    while (i < n1) 
		    { 
		        iArray[k] = firstArr[i]; 
		        i++; 
		        k++; 
		    } 

		    // Copy the remaining elements of secondArr[], if there 
		      // are any */
		    while (j < n2) 
		    { 
		        iArray[k] = secondArr[j]; 
		        j++; 
		        k++; 
		    } 
		    
	}
	
}
