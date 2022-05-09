package Assignment_01;

import Unit_02.Assignment01_SampleClass1;

/*

Access Modifier	    within class     within package	  outside package by subclass only	    outside package
1.Private	             Y	              N	                         N	                           N
2.Default	             Y	              Y	                         N	                           N
3.Protected	             Y	              Y	                         Y	                           N
4.Public	             Y	              Y	                         Y	                           Y
*/

public class Question_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment01_SampleClass1 obj1 = new Assignment01_SampleClass1();
		obj1.name = "Amandeep";     //   public outside package
		obj1.rollNum = 9;           //    default outside package (error)
		obj1.age = 20;              //    private outside package (error)
		obj1.sec = 'E';             //    protected outside package (error)

		
		SampleClass2 obj2 = new SampleClass2();
		obj2.setters();
		obj2.display();             //    Outside package by subclass 
		
		SampleClass3 obj3 = new SampleClass3();
		obj3.name = "Amandeep";
		obj3.rollNum = 9;  
		obj3.age = 20;              //    private within package (error)
		obj3.sec = 'E';     
		
		obj3.display();             //   This is accessing within class
	}

}

class SampleClass2 extends Assignment01_SampleClass1 {
	
	void display() {
		System.out.println("Name: " + name );
		System.out.println("Rollnum: " + rollNum);     //   default outside package by subclass only (error) 
		System.out.println("Age: " + age);             //   private outside package by subclass only (error)
		System.out.println("Section: " + sec);
	}
}

class SampleClass3{
	
	public String name;
	int rollNum;
	private int age;
	protected char sec;
	
	void display() {
		System.out.println("Name: " + name );
		System.out.println("Rollnum: " + rollNum);     
		System.out.println("Age: " + age);            
		System.out.println("Section: " + sec);
	}
	
}
