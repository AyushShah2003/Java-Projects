package Unit_01;

public class P4_Task01_ControlAndConditionalStatementsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Statements obj = new Statements();
		
		obj.DecisionMakingStatements();
		obj.LoopStatements();
		obj.JumpStatements();

	}

}

class Statements{
	
	void DecisionMakingStatements() {
		
		int x = 10;
		int y = 12;
		if (x + y < 10) {
			System.out.println("x + y is less than 10");
		}
		else {
			System.out.println("x + y is greater than 20");
		}
		
		int num = 2;
		
		// can we use char instead of int as num??
		
		switch(num) { // switch (expression)
		case 0: // case value1:
			System.out.println("Number is 0");
			break;
		case 1:
			System.out.println("Number is 1");
			break;
		default:
			System.out.println(num);
		}
	}
	
	void LoopStatements() {
		/*
		 * for (initialization, condition, increment/decrement) } { //block of statements }
		 * for (data_types var : array_name/collection_name){ //statements }
		 */
		
		//For loop
		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum = sum + j;
		}
		System.out.println("The sum of first 10 natural numbers is " + sum);
		
		//For each
		String[] names = { "Java", "C++", "Python", "Javascript" };
		System.out.println("\nPrinting the content of the array names:");
		for (String name: names) {
			System.out.println(name);
		}
		System.out.println();
		
		/*
		 * while (conditions){ //looping statements }
		 */
		int i = 0;
		System.out.println("Printing the list of first 10 even numbers");
		while (i <= 10){
			System.out.println(i);
			i = i + 2;
		}
		System.out.println();
		
		/*
		 * do-while do { //statements } while (conditions);
		 */
		i = 0;
		System.out.println("Printing the list of first 10 even numbers");
		do {
			System.out.println(i);
			i = i + 2;
		}while (i <= 10);
		System.out.println();
	}
	
	void JumpStatements() {
		
		// Break
		for (int i = 0; i<= 10; i++) {
			System.out.println(i);
			if (i == 6) {
				break;
			}
			System.out.println(i);
		}
		System.out.println();
		// Continue
		for (int i = 0; i <= 10; i++) {
			
			if ( i == 6) {
				continue;
			}
			System.out.println(i);
		}
	}
}