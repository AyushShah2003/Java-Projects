package Unit_01;

import java.util.Scanner;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457a");
		String s2 = new String("7545");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	Scanner sc = new Scanner(System.in);
	
	void palindromeOrNot(String s) {
		// Write Logic Here!
		
		int i = 0;
		
		int j = s.length() - 1;
		
		while (i!=j) {
			
			if (s.charAt(i) != s.charAt(j)) {
				System.out.println("String are not palindrome");
				return;
			}
			i++;
			j--;
		}
		
		System.out.println("String is palindronme");
		
	}

	void reverseOfAString(String s) {
		// Write Logic Here!
		
		
		int j = s.length()-1;
		
		String str = "";
		
		while (s.length() != str.length()) {
			
			str = str + s.charAt(j--);
			
		};
		
		System.out.println("Reverse String : " + str);
		
	}
	
	void stringEqualOrNot(String s1,String s2) {
		// Write Logic Here!
		
		int i = 0;
		int j = 0;
		
		if (s1.length() == s2.length()) {
		    while(i != s1.length()) {
			    if (s1.charAt(i++) != s2.charAt(j++)) {
				    System.out.println("String not Equal");
				    return;
			    }
		    }
		    System.out.println("Strings are equal");
		    return;
		}
		System.out.println("String not Equal");
	}
}