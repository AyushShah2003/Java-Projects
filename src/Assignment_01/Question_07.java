package Assignment_01;
/*
Q7. WAP to count the total number of calls for a member function:
display(), from more than one objects and how many times the object is
created of a class name Employee.
Note: Call display() function from more than 3 objects
 */
public class Question_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee2 E1 = new Employee2("Amandeep");
		
		E1.display();
		E1.display();
		E1.display();
		
		System.out.println("No. of times the function called: " + E1.count);
		
        Employee2 E2 = new Employee2("Mansi");
		
		E2.display();
		E2.display();
		E2.display();
		
		System.out.println("No. of times the function called: " + E2.count);
		
	}

}

class Employee2{
	static int count = 0;
	String name;
	
	Employee2(String name){
		this.name = name;
	}
	
	void display() {
		System.out.println("Name: " + name);
		count++;
	}
}

