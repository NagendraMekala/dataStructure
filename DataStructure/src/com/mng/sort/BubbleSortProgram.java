package com.mng.sort;

public class BubbleSortProgram {
	public static void main(String[] args) {
	     int[] array = {99, 88, 55, 77, 1, 66};
	     int temp;
	    for(int pass = 1; pass <array.length; pass++) {
	    	for(int current=0; current < array.length-pass; current++) {
	    		//System.out.println("I:J "+pass +": "+current);
	    		if(array[current] > array[current+1]) {
	    		//	 System.out.println(array[current] +" > "+array[current + 1]);
	    			temp = array[current];
	    			array[current] = array[current + 1];
	    			array[current + 1] = temp;
	    		}
	    	}
	    }    
	    System.out.println("After Sorting Elements");
	    for(int i : array) {
	    	System.out.println(i);
	    }
	}
}
