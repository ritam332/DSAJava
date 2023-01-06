package Codes;

import java.util.Arrays;

public class BinarySearch2darray {

	public static void main(String[] args) {
		int[][] arr= {{1,3,5},{7,9,12},{15,19,21}};
		int target=19;
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.toString(search(arr,target)));

	}

	 static int[] search(int[][] arr, int target) {
		int row=0, col=arr.length-1;
		while(row<arr.length && col>=0) {
			if (arr[row][col]==target) {
				return new int[] {row,col};
			} if (arr[row][col]<target) {
				row++;
			} else { col--;

			}
		} return new int[]{-1,-1};
	}

}
