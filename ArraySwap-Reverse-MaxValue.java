package Codes;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;

public class SwapArray {

	public static void main(String[] args) {
		int[] arr= {1,3,6,90,21,-33,550};
		swap(arr,1,3);
		System.out.println(Arrays.toString(arr));
		System.out.println(max(arr));
		System.out.println(maxRange(arr,5,4));
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
    static int maxRange(int[] arr, int start, int end) {
    	 if (end>start) {
 			return -1;
 		}
    	 int maxValue=arr[0];
		 for(int i=start;i<=end;i++) {
			 if (maxValue<arr[i]) {
				maxValue=arr[i];
			}
		 } return maxValue;
	}
//to get max value in an array
	 static int max(int[] arr) {
		 int maxValue=arr[0];
		
	 for(int i=1;i<arr.length;i++) {
			 if (maxValue<arr[i]) {
				maxValue=arr[i];
			}
		 } return maxValue;
	}
//swapping of array
	static void swap(int[] arr, int i1, int i2) {
		int temp=arr[i1];
		arr[i1]=arr[i2];
		arr[i2]=temp;
	}
	// reversing an array
   static void reverse(int[]arr) {
	int start=0;
	int end=arr.length-1;
	while(start<end) {
		swap(arr, start, end);
		start++;
		end--;
	}
}

}
