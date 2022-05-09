package Assignment_01;

import java.util.Scanner;

/*
 * WAP which would contain 6 objects of a class Student. Student[Name, Age, section, percentage]. They all belong to Section-A. Your 
 * program would be able to find the average percentage of students in this section. Use constructors to create these 6 objects and 
 * input from Scanner class.
 * 
 * */

public class Question_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		
		Student[] Students = new Student[n];
		
		for (int i = 0 ; i < n; i++) {
			System.out.println("Student " + (i+1));
			Students[i] = new Student();
		}
		
		int total = 0;
		
		for (int i = 0; i < n; i++) {
			total += Students[i].percentage;
		}
		
		int avg_Perc = total/n;
		
		System.out.println("Average Percentage: " + avg_Perc);

	}

}

class Student {
	String name;
	int age;
	char section;
	int percentage;
	
	Scanner sc = new Scanner(System.in);
	
	Student(){
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		
		System.out.print("Enter Age: ");
		age = sc.nextInt();
		
		System.out.print("Enter Section: ");
		section = sc.next().charAt(0);

		System.out.print("Enter Percentage: ");
		percentage = sc.nextInt();	
		
		System.out.println();
		
	}
}