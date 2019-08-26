package com.mng.sort;

public class SelctionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] input = {10, 8, 99, 7, 1, 5, 88, 9};
		     int temp;
		     
		     int inputLength = input.length;

		        for (int i = 0; i < inputLength-1; i++) {

		            int min = i;

		            // find the first, second, third, fourth... smallest value
		            for (int j = i+1; j < inputLength; j++) {
		                if (input[j] < input[min]) {
		                    min = j;
		                }
		            }

		            // swaps the smallest value with the position 'i'
		            temp = input[i];
		            input[i] = input[min];
		            input[min] = temp;

		            //next pls
		            System.out.println("I: "+ +i);
		        }
		        
		        System.out.println("After Sorting Elements");
			    for(int i : input) {
			    	System.out.println(i);
			    }
		        
	}

}
