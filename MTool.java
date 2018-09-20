package program;
/**
 * @authors Matthew Gober, Lizzy Hamaoka 
 * September 17,2018
 * ESOF 322 - Assignment 2	
 *
 *Merge Sort Class sourced from http://www.cburch.com/csbsju/cs/160/notes/29/2.html
 */
public class MTool implements MathSort {


	 // MyMathSort: reorders the elements of iArray so that they are in
    // increasing order.
    public void MyMathSort(int[] iArray) {
 
        if(iArray.length > 1) {
            // split the array into two pieces, as close to the same
            // size as possible.
            int[] first = extract(iArray, 0, iArray.length / 2);
            int[] last = extract(iArray, iArray.length / 2, iArray.length);

            // MyMathSort each of the two halves recursively
            MyMathSort(first);
            MyMathSort(last);

            // merge the two sorted halves together
            merge(iArray, first, last);
        }
        }

    // extract: returns a subarray of iArray, starting with index
    // start in iArray, continuing to (but not including) index
    // last.
    private int[] extract(int[] iArray, int start, int last) {
        int[] ret = new int[last - start];
        for(int i = 0; i < ret.length; i++) ret[i] = iArray[start + i];
        return ret;
    }

    // merge: merges arrays a and b, placing the result into the
    // array dest. This only works if both a and b are already in
    // increasing order.
    private void merge(int[] dest, int[] a, int[] b) {
        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length) {
            if(a[i] < b[j]) {
                dest[i + j] = a[i];
                ++i;
            } else {
                dest[i + j] = b[j];
                ++j;
            }
        }
        for(; i < a.length; i++) dest[i + j] = a[i];
        for(; j < b.length; j++) dest[i + j] = b[j];
       
    }
	
}
