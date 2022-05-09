package Assignment_01;

import java.util.Scanner;

/*
Q8. WAP in java, to delete index=3, element from the given array
mentioned below.
Int[] arr = {1,2,3,4,5,6,7,8,9}
Note: Non relevance places would be filled with zeros.
 */

public class Question_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int len = arr.length;
		
		System.out.println("Enter index to be deleted: ");
		int n = sc.nextInt();
		
		int i , j;
		
		for (i = n, j = n+1; i < len-1 ; i++,j++  ) {
			
			arr[i] = arr[j];
		}
		
		arr[i] = 0;
		
		System.out.println("Array after deletion...");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
