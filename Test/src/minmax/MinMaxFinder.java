package minmax;

import java.util.Arrays;

public class MinMaxFinder {

	static int[] findMinMax(int[] arr) {
		
		int resArr[]=new int[2];
		Arrays.sort(arr);
		resArr[0] = arr[0];
		resArr[1] = arr[arr.length-1];
		return resArr;
	}
	
	static int findMin(int[] arr) {
		
		 Arrays.sort(arr); 
		 int min = arr[0];
		 return min;
	 }
	
	 static int findMax(int[] arr) {
		 
		 Arrays.sort(arr);
		 int max =  arr[arr.length - 1]; 
		 return max;
	 } 
}