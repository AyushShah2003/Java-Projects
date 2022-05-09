package Unit_01;

/*
 * -50 such keywords[reserved words],meaning are defined by the developer
 * -48+2
 * -48 use
 * -2 for future use [goto*,cons*]
 * 
 *  future use: goto*,const[*]
 *  1.2V :assert**
 *  1.4V :strictfa***
 *  5.0V :enum***
 *  keywords cannot be used as identifiers in java
 *  object
 *  variable name 
 *  function
 *  class
 *  etc
 */

public class P2_Task01_KeywordsInJava {

	public static void main(String[] args) {
		
		//Error - P2_Task02_ConstantsInJava cannot be resolved to a variable
		System.out.println(P2_Task02_ConstantsInJava.Pi);
		
		//variable name
		//Syntax error on token "double", invalid VariableDeclaratorId
		int double = 12;
		
		//function names
		//Syntax error on token "new", invalid AnnotationName
		//Syntax error, insert "[ ]" to complete Dimension
		//Syntax error, insert ";" to complete LocalVariableDeclarationStatement
		int new() {
			
			//sysout[ctrl + space]
			System.out.println();
			
			//Error, Void methods cannot return a value
			return 0;
		}
		
		int a=10;
		a=11;
		
		//class name[Given below]
		
		//object
		//object  name can never be any keywords in java
		//Error, ABC cannot be resolved to a variable
		//Syntax error on token "int", delete this token
		ABC int = new ABC();
		//obj.display();			
		
	}

}

//class can never be any keywords we have in java
class int{
	
}
