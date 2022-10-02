/**
 * 
 */
package org.gfgapi.school;

import java.util.ArrayList;

/**
 * Value equal to index value
 * Given an array Arr of N positive integers. 
 * Your task is to find the elements whose value is equal to that of its index value 
 * ( Consider 1-based indexing ).
 * 
 * @author nikhilsharma03
 * @SC O(1)
 * @TC O(N)
 */ 
public interface ValueEqualToIndex {

	/**
	 * You don't need to read input or print anything. 
	 * Your task is to complete the function valueEqualToIndex() which takes the array of integers arr[] 
	 * and n as parameters and returns an array of indices where the given conditions are satified. 
	 * When there is not such element exists then return an empty array of length 0.
	 * @param arr {15, 2, 45, 12, 7}
	 * @param n 5
	 * @return 2
	 * @error []
	 */
	ArrayList<Integer> valueEqualToIndex(int arr[], int n);
	
}
