package java_programs;

import java.util.Arrays;
import java.util.Random;

public class Shuffle_arrays {
	    static void Shuffel(int[]arr) {
	    	Random rand=new Random();
	    	for(int i=0;i<arr.length;i++) {
	    		int rem=rand.nextInt(arr.length);
	    		int temp=arr[rem];
	    		arr[rem]=arr[i];
	    		arr[i]=temp; 		
	    	}
	    	System.out.println(Arrays.toString(arr)+"");   
	    }
	    public static void main(String[]args) {
	    	int[]arr= {8,6,7,9,10,34};
	    	Shuffel(arr);
	    }
	}


