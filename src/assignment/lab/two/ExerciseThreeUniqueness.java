package assignment.lab.two;

import java.util.Arrays;
import org.knowm.xchart.*;
/*
 * Jasper Belenzo
 * 301329283
 */

public class ExerciseThreeUniqueness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = generateUniqueIntArray(250000); // 1
		int[] array2 = generateUniqueIntArray(500000); // 2
		int[] array3 = generateUniqueIntArray(750000); // 3
		int[] array4 = generateUniqueIntArray(850000); // 4
		int[] array5 = generateUniqueIntArray(940000); // 5
		int[] array6 = generateUniqueIntArray(950000); // 6
		int[] array7 = generateUniqueIntArray(960000); // 7
		int[] array8 = generateUniqueIntArray(970000); // 8
		int[] array9 = generateUniqueIntArray(980000); // 9
		int[] array10 = generateUniqueIntArray(990000); // 10
		int[][] intArrays1 = { array1, array2, array3, array4, 
				array5, array6, array7, array8, array9, array10 };
		
		InputNandTimeT[] inatt1 = new InputNandTimeT[10];
		// int trials = 10; // Ten Trials for both unique1 U1 and unique2 U2 
		System.out.println("Experimental Analysis on unique1()");
		System.out.println("One (1) Minute is 60,000 Milliseconds");
	    int[] inputNu1 = new int[10];
	    long[] timeTu1 = new long[10];
	    for (int t1 = 0; t1 < inatt1.length; t1++) {
	    	long startTime = System.currentTimeMillis();
	    	boolean isUnique = unique1(intArrays1[t1]);
	    	long endTime = System.currentTimeMillis();
	    	long elapsed = endTime - startTime;
	    	inputNu1[t1] = intArrays1[t1].length;
	    	timeTu1[t1] = elapsed;
	    	inatt1[t1] = new InputNandTimeT(inputNu1[t1], timeTu1[t1], isUnique);
	    	System.out.println("unique1() - Trial: " + t1 + ", Input N Size: " + inatt1[t1].getInputN() + ", Elapsed Time: " + inatt1[t1].getTimeT() + ", Is Unique: " + inatt1[t1].getResultValue());
	    }
		System.out.println("Using BINARY SEARCH: Ideal Input Size N for unique1() to run in One Minute 'more or else' is --> " + binarySearchIterative(inatt1).getInputN() + ", timed at " + binarySearchIterative(inatt1).getTimeT());
	    
		array1 = generateUniqueIntArray(410156); // 1
		array2 = generateUniqueIntArray(820312); // 2
		array3 = generateUniqueIntArray(1640625); // 3
		array4 = generateUniqueIntArray(3281250); // 4
		array5 = generateUniqueIntArray(6562500); // 5
		array6 = generateUniqueIntArray(13125000); // 6
		array7 = generateUniqueIntArray(26250000); // 7
		array8 = generateUniqueIntArray(52500000); // 8
		array9 = generateUniqueIntArray(105000000); // 9
		array10 = generateUniqueIntArray(210000000); // 10
		int[][] intArrays2 = { array1, array2, array3, array4, 
				array5, array6, array7, array8, array9, array10 };
		
		InputNandTimeT[] inatt2 = new InputNandTimeT[10];
		// int trials = 10; // Ten Trials for both unique1 U1 and unique2 U2 
		System.out.println("\n\nExperimental Analysis on unique2()");
		System.out.println("One (1) Minute is 60,000 Milliseconds");
	    int[] inputNu2 = new int[10];
	    long[] timeTu2 = new long[10];
	    for (int t2 = 0; t2 < inatt2.length; t2++) {
	    	long startTime = System.currentTimeMillis();
	    	boolean isUnique = unique2(intArrays2[t2]);
	    	long endTime = System.currentTimeMillis();
	    	long elapsed = endTime - startTime;
	    	inputNu2[t2] = intArrays1[t2].length;
	    	timeTu2[t2] = elapsed;
	    	inatt2[t2] = new InputNandTimeT(inputNu2[t2], timeTu2[t2], isUnique);
	    	System.out.println("unique2() - Trial: " + t2 + ", Input N Size: " + inatt2[t2].getInputN() + ", Elapsed Time: " + inatt2[t2].getTimeT() + ", Is Unique: " + inatt2[t2].getResultValue());
	    }
	    System.out.println("Using BINARY SEARCH: Ideal Input Size N for unique2() to run in One Minute 'more or else' is --> " + binarySearchIterative(inatt2).getInputN() + ", timed at " + binarySearchIterative(inatt2).getTimeT());
	    System.out.println("unique2() is too fast and INT data type which is just 32-bit (2,147,438,647) is NOT enough to generate input \nthat will make it run close to One (1) Minute");
	}
	
	/** Returns true if the target value is found in the data array. */
	public static InputNandTimeT binarySearchIterative(InputNandTimeT[] data) {
		int low = 0;
	    int high = data.length - 1;
	    while (low <= high) {
	    	int mid = (low + high) / 2;
	    	if ((data[mid].getTimeT() > 58500) && (data[mid].getTimeT() < 60500))	// found a match
	    		return data[mid];
	    	else if ( 60500 < data[mid].getTimeT()) {
	    		high = mid - 1;		// only consider values left of mid
	    		// System.out.println("mid: " + mid + ", high: " + high);
	      } else {
	    	  	low = mid + 1;		// only consider values right of mid
	      		// System.out.println("mid: " + mid + ", low: " + low);
	      }
	    }
	    return new InputNandTimeT(0, 0, null);               // loop ended without success
	  }

	/** Returns true if there are no duplicate elements in the array. */
	public static boolean unique1(int[] data) {
		int n = data.length;
	    for (int j=0; j < n-1; j++)
	    	for (int k=j+1; k < n; k++)
	    		if (data[j] == data[k]) {
	    			return false;	// found duplicate pair
	    		}
	    return true;	// if we reach this, elements are unique
	  }

	/** Returns true if there are no duplicate elements in the array. */
	public static boolean unique2(int[] data) {
		int n = data.length;
	    int[] temp = Arrays.copyOf(data, n);   // make copy of data
	    Arrays.sort(temp);                     // and sort the copy
	    for (int j=0; j < n-1; j++) {
	    	if (temp[j] == temp[j+1]) {		// check neighboring entries
	    		return false;	// found duplicate pair
	    	}
		}
	    return true;		// if we reach this, elements are unique
	}

	public static int[] generateUniqueIntArray(int arraySize) {
		int[] intArray = new int[arraySize];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = arraySize - i;
		}
		return intArray;
	}

}
