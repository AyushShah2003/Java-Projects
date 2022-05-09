package Assignment_01;

public class Question_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassThree obj1 = new ClassThree(1);
		ClassThree obj2 = new ClassThree();

	}

}

class ClassOne{
	
	ClassOne(int a){
		System.out.println("Inside the Parameterized Constructor of ClassOne");
	}
}

class ClassTwo extends ClassOne{
	
	ClassTwo(){
		super(0);
		System.out.println("Inside the Default Constructor of ClassTwo");
	}
}

class ClassThree extends ClassTwo{
	
	ClassThree(){
		System.out.println("Inside the Default Constructor of ClassThree");
	}
	
	ClassThree(int x){
		System.out.println("Inside the Parameterized Constructor of ClassThree");
	}
}