package Unit_01;

/*
 * 
 * - Piece of data/code that would never change
 * - Constants never change once a value is assigned
 * 
 * private: "Inside Class only"
 * protected: class + same package
 * public: Class + Within the package + Outside the package
 * Default: No keyword, package-private {Not outside package}
 * 
 */

public class P2_Task02_ConstantsInJava {
	
	private static final double Pi = 3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int a=10;
		// a = 11;
		
		// Cannot take a static reference to the non static field Pi
		System.out.println(Pi);
		
		System.out.println(a);
		
		//Cannot take a static reference to the non static method add(int int )
		// the type P2_Task02_ConstantsInJava
		add(1,2);
		
		//Error, Cannot make a static reference to the non-static method multi(int, int) from the type P2_Task02_ConstantsInJava
		multi(1,2);
		
		//Error, Calculator cannot be resolved to a type
		Calculator obj = new Calculator();
		System.out.println(obj.add(1,2));
		System.out.println(obj.a);
		
	}
	
	static int add(int a, int b){
		
		// sysout[ctrl + space]
		System.out.println(a);
		
		System.out.println(Pi);
		
		return(a + b);
	}
	
	int multi(int a, int b) {
		return(a * b);
	}
}
/*
 * 
 * public static final double Pi = 3.14; //Pi=3.18
 * 
 * public static void main(String[] args)
 * 
 * System.out.println(Pi); 
 * 
 * main("askbdfbsk");
 * 
 * NewClass obj = new NewClass(); 
 * 
 * obj.add(1,2); 
 * 
 * System.out.println(obj.Pi);
 * 
 * }
 */


