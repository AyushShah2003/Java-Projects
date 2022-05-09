package Unit_01;

import java.util.Scanner;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3};

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		// write code here!
		
		// Bubble Sort Algorithm
		
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			int count = 0;
			for (int j = 0; j < arr.length - i - 1 ; j++) {
				
				if (arr[j+1] < arr[j]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					count = 1;
				}
			}
			if (count == 0) {
				break;
			}
		}
		
		for (int i = 0; i  < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	void findTheDuplicateElements(int[] arr) {
		// write code here!
		
		int n = arr.length;
		int[] temp = new int[n];
		
		for (int i = 0; i< arr.length; i++) {
			temp[i] = arr[i];
		}
		
		int count;
		for (int i = 0; i < temp.length-1 ; i++) {
			count = 0;
			for (int j = i+1; j < temp.length; j++) {
				
				if (temp[j] != -1) {
					
					if (temp[i] == temp[j]) {
						count++;
						temp[j] = -1;
					}
				}
			}
			
			if (count > 0) {
				System.out.print(temp[i] + " ");
			}
		}
		System.out.println();

	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here!
		
		
		int Large = arr[0];
		int sLarge = arr[0];
		
		int Small = arr[0];
		int sSmall = arr[1];
		
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i] > sLarge) {
				
				if (arr[i] > Large) {
					sLarge = Large;
					Large = arr[i];
				}
				else {
					sLarge = arr[i];
				}
			}
			
			if (arr[i] < sSmall) {
				
				if (arr[i] < Small){
					sSmall = Small;
					Small = arr[i];
				}
				else {
					sSmall = arr[i];
				}
			}
		}
		
		System.out.println("Second Large: " + sLarge);
		System.out.println("Second Small: " + sSmall);
		

	}

	void leftRotationInAnArray(int[] arr) {
		// write code here!
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int n = arr.length;
		int m = a % n;
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[(m + i) % n] + " ");
		}
		
		System.out.println();

	}

	void removeElementInArray(int[] arr) {
		// write code here!
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++){
			
		      if(arr[i] == a){
		    	  
		           for(int j = i; j < arr.length - 1; j++){
		               arr[j] = arr[j+1];
		           }
		           break;
		      }
		 }
		 
		 for (int i = 0; i < arr.length - 1; i++){
		      System.out.print(arr[i] + " ");
		 }                
	
	}
		
		
}

