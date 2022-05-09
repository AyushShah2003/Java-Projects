package Assignment_01;

/*
Q3- Given an interface in1 which includes a method display which takes
an integer as input .
interface In1
{
void display(int p);
}
Task is to write a class testClass which implements interface In1 and has
a method named display which takes an integer as an input p and the
display method should be able to tell if the number is prime or not?
- The main method should not be in testClass, create a separate class for
that.
*/

public class Question_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20;
		
		testClass T1 = new testClass();
		
		T1.display(a);
	}

}

interface In1{
	void display(int a);
}

class testClass implements In1{
	
	testClass(){
		System.out.println("Inside constructor ");

	}
	
	public void display(int age){
		System.out.println("Age: " + age);
	}
}