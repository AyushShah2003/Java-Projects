package Assignment_01;
/*
Q6. As given there are two sample methods: First one returns the sum of
two numbers a and b and second one returns the subtraction of a and b. if
a-b is negative then return value would be 0. Use ternary operator to call
these two methods. If a>b then ternary should call sum(a,b) but if a<b
then ternary operator should call sub(a,b). Eventually print the result of
the ternary operation on variable a and b.
Note: Ternary operator can call a method even for true and false values
two numbers a and b and second one returns the subtraction of a and b. if
a-b is negative then return value would be 0. Use ternary operator to call
these two methods. If a>b then ternary should call sum(a,b) but if a<b
then ternary operator should call sub(a,b). Eventually print the result of
the ternary operation on variable a and b.
Note: Ternary operator can call a method even for true and false values
 * of a and b. if a-b is negative then return value would be 0. Use ternary operator to call these two methods. if a>b then ternary
 * should call sum(a,b) but if a<b then ternary operator should call sub(a,b). Eventually print the result of the ternary 
 * operation on variable a and b.
 
*/
import java.util.Scanner;

public class Question_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int x = sc.nextInt();
		
		System.out.println("Enter first number: ");
		int y = sc.nextInt();
		
		int result = (x > y)? sum(x,y) : sub(x,y);
		
		System.out.println("Result : " + result);
	}
	
	public static int sum(int a, int b) {
		return (a+b);
	}
	
	public static int sub(int a, int b) {
		int res = a-b;
		if (res < 0) {
			return 0;
		}
		return res;
	}
}