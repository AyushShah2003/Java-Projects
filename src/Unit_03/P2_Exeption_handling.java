package Unit_03;

import java.util.Scanner;

public class P2_Exeption_handling {
	
			public static void main(String args[])
			{
				practical obj = new practical();
//				obj.basic_exception();
//				obj.handleException();
//				obj.multiplecatch();
//				obj.InputMismatchException();
				obj.stackoverflowError();
			}

}

class practical
{
	
	void basic_exception()
	{
		
		int a=0;
		int b=100/a;
		System.out.println(b);
		
		
		System.out.println("done!");
	}
	
	void handleException()
	{
		try {
			int a=0;
			int b=100/a;
			System.out.println(b);
			}
			catch(Exception e)
			{
				System.out.println("arithmetic error occured");
			}
			System.out.println("done!");
	}
	
	void multiplecatch()
	{
		
		try {
			int a=0;
			int b=100/a;
			System.out.println(b);
			}
		catch(Exception e)
		{
			System.out.println("arithmetic error occured");
		}
		//error as Exception is a super class of arithemetic_exception class
//		catch(ArithmeticException e)
//		{
//			System.out.println("/ by 0");
//		}
		
			System.out.println("done!");
		}
	
	void InputMismatchException()
	{
		try {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println(n);
		}
		catch(Exception e)
		{
			System.out.println("inout mismatch handled");
		}
		System.out.println("done!");
	
		
		
	}
	void stackoverflowError()
	{
		try {
		int i=5;
		while(i>0)
		{
			i++;
		}
		}
		catch(Exception e)
		{
			System.out.println("exception handled stacck overflow");
		}
		System.out.println("done!");
	}
	
	void indexOutofBoundException() {
        try {
            int[] num= {1,2,3,4};
            System.out.println(num[10]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Done!!");
    }
    void nullPointerException() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    
    void useofThrow(int age) throws Exception{
        if(age<18){
            throw new Exception();
        }
        else{
            System.out.println("You are allowed to enter");
        }
    }
    void useofThrow_And_Finally() {
        try{
            useofThrow(17);
        }catch (Exception e){
            //TODO Auto generated catch blocl
            e.printStackTrace();
        }
        finally{
            System.out.println("The 'try catch' block is finished");
        }
    }




	void checkedAndUncheckedException() {

		/*
		 * Unchecked Exception: Run time catching - Here we are dividing by 0 - which
		 * will not be caught at compile time - as there is no mistake but caught at
		 * runtime - because it is mathematically incorrect
		 */
		int x = 0;
		int y = 10;
		int z = y / x;

		System.out.println(z);

		// Checked Exception [Run this code over terminal and check compiler error]
		try {
			useOfThrow(19);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void manualExceptionThrow() {

		try {

			// Have to use try and Catch here!
			calculateArea(-1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	void calculateArea(int r) throws ManualException {

		if (r < 0) {
			throw new ManualException();
		}

		int area = r * r;
		System.out.println(area);

	}

}

@SuppressWarnings("serial")
class ManualException extends Exception {

	@Override
	public String getMessage() {
		String detailMessage = "Exception Occured!";
		return detailMessage;
	}


}

	

