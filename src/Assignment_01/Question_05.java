package Assignment_01;

import java.util.Scanner;

/*
5Q. WAP in Java which would contain 8 objects of a Class Employee.
Employee contains name, age, department, salary. Your program would
be able to calculate the total salary to be paid in each department. Use
constructors to create these 8 objects and Scanner to take inputs.
Restrictions:
1- Minimum 8 objects [can be created manually with parameterized
constructors with Scanner input]
2- Departments are, A, B, C, D: minimum 4 departments [String Type]
3- If the Salary exceeds more than 30,000, then the default salary
would be 25000 of any of the employee
4- Use array of objects, instead of using multiple 8 objects separately
Use:
Employee arr[] = new Employee[8];
And
arr[i].department.equals("A");
 */

public class Question_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 2;
		
		Employee E[] = new Employee[n];
		
		for (int i = 0; i < n; i++) {
			
			E[i] = new Employee();
			
		}
		
		System.out.println("Displaying details...");
        for (int i = 0; i < n; i++) {
			
			E[i].display();
			
		}
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		for (int i = 0; i < n; i++) {
			if (E[i].department == 'A') {
				
				A += E[i].salary;
			}
            if (E[i].department == 'B') {
				
				B += E[i].salary;
			}
            if (E[i].department == 'C') {
            	C += E[i].salary;
            }
            if (E[i].department == 'D') {
        	    D += E[i].salary;
        	}
		}

		System.out.println("Salary of department A: " + A );
		System.out.println("Salary of department B: " + B );
		System.out.println("Salary of department C: " + C );
		System.out.println("Salary of department D: " + D );
		
	}

}

class Employee{
	String name;
	int age;
	char department;
	int salary;
	
	Scanner sc = new Scanner(System.in);
	
	Employee(){
		System.out.println("Enter Details...");
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		System.out.print("Enter Age: ");
		age = sc.nextInt();
		System.out.print("Enter department: ");
		department = sc.next().charAt(0);
		System.out.print("Enter Salary: ");
		salary = sc.nextInt();
		
		if (salary > 30000) {
			salary = 25000;
		}
		
	}
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("department: " + department);
		System.out.println("Salary: " + salary);
	}
}
