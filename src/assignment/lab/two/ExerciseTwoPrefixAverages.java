package assignment.lab.two;
import org.knowm.xchart.*;
/*
 * Jasper Belenzo
 * 301329283
 */
public class ExerciseTwoPrefixAverages {
	/** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
	public static double[] prefixAverage1(double[] x) {
		int n = x.length;
	    double[] a = new double[n];    // filled with zeros by default
	    for (int j=0; j < n; j++) {
	    	double total = 0;            // begin computing x[0] + ... + x[j]
	    	for (int i=0; i <= j; i++) {
	    		total += x[i];
	    	}
	    	a[j] = total / (j+1);        // record the average
	    }
	    return a;
	  } // prefixAverage1

	/** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
	public static double[] prefixAverage2(double[] x) {
		int n = x.length;
		double[] a = new double[n];    // filled with zeros by default
		double total = 0;              // compute prefix sum as x[0] + x[1] + ...
		for (int j=0; j < n; j++) {
			total += x[j];               // update prefix sum to include x[j]
			a[j] = total / (j+1);        // compute average based on current sum
		}
		return a;
	} // prefixAverage2
	
	public static void main(String[] args) {
		double[] array1000 = generateDoubleArray(1000); // 1
		double[] array4000 = generateDoubleArray(4000); // 2
		double[] array9000 = generateDoubleArray(9000); // 3
		double[] array14000 = generateDoubleArray(14000); // 4
		double[] array19000 = generateDoubleArray(19000); // 5
		double[] array23000 = generateDoubleArray(23000); // 6
		double[] array27000 = generateDoubleArray(27000); // 7
		double[] array31000 = generateDoubleArray(31000); // 8
		double[] array35000 = generateDoubleArray(35000); // 9
		double[] array39000 = generateDoubleArray(39000); // 10
		double[][] doubleArrays = { array1000, array4000, array9000, array14000, array19000, array23000, array27000, array31000, array35000, array39000};
		int trials = 10; // Ten Trials for both prefixAverage1 PA1 and prefixAverage2 PA2 
	    System.out.println("Experimental Analysis on prefixAverage1()");
	    double[] inputNpa1 = new double[10];
	    double[] timeTpa1 = new double[10];
	    for (int t1 = 0; t1 < trials; t1++) {
	    	long startTime = ((System.nanoTime()) / 1000);
	    	double[] resultValueDoubleArray = prefixAverage1(doubleArrays[t1]);
	    	long endTime = ((System.nanoTime()) / 1000);
	    	long elapsed = endTime - startTime;
	    	inputNpa1[t1] = doubleArrays[t1].length;
	    	timeTpa1[t1] = elapsed;
	    	System.out.println("PrefixAverage1() - Trial: " + t1 + ", Input N Size: " + inputNpa1[t1] + ", Elapsed Time: " + timeTpa1[t1]);
	    }
	    System.out.println("\n\nExperimental Analysis on prefixAverage2()");
	    double[] inputNpa2 = new double[10];
	    double[] timeTpa2 = new double[10];
	    for (int t2 = 0; t2 < trials; t2++) {
	    	long startTime = ((System.nanoTime()) / 1000);
	    	double[] resultValueDoubleArray = prefixAverage2(doubleArrays[t2]);
	    	long endTime = ((System.nanoTime()) / 1000);
	    	long elapsed = endTime - startTime;
	    	inputNpa2[t2] = doubleArrays[t2].length;
	    	timeTpa2[t2] = elapsed;
	    	System.out.println("PrefixAverage2() - Trial: " + t2 + ", Input N Size: " + inputNpa2[t2] + ", Elapsed Time: " + timeTpa2[t2]);
	    }
	    XYChart chart = new XYChartBuilder().xAxisTitle("Input N").yAxisTitle("Time T (in microseconds)").width(1200).height(900).build();
	    XYSeries seriesPa1 = chart.addSeries("prefixAverage1()", inputNpa1, timeTpa1);
	    XYSeries seriesPa2 = chart.addSeries("prefixAverage2()", inputNpa2, timeTpa2);
	    new SwingWrapper<XYChart>(chart).displayChart();
	}

	public static double[] generateDoubleArray(int arraySize) {
		double[] doubleArray = new double[arraySize];
		for (int i = 0; i < doubleArray.length; i++) {
			doubleArray[i] = arraySize - i;
		}
		return doubleArray;
	}
}
