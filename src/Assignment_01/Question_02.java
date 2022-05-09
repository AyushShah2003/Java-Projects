package Assignment_01;

/*
Q2- WAP to count the total number of calls for a member function from more than one objects. [Let�s say, from 3 such Objects]
 */

public class Question_02 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleClass S1 = new SampleClass("Amandeep");
		
		S1.display();
		S1.display();
		S1.display();
		
		System.out.println("No. of times the function called: " + S1.count);
		
        SampleClass S2 = new SampleClass("Mansi");
		
		S2.display();
		S2.display();
		S2.display();
		
		System.out.println("No. of times the function called: " + S2.count);
		
	}

}

class SampleClass{
	static int count = 0;
	String name;
	
	SampleClass(String name){
		this.name = name;
	}
	
	void display() {
		System.out.println("Name: " + name);
		count++;
	}
}
