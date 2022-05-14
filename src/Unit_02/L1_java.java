L01-Exception 

package test;
public class SampleClass{
public static void main(String[] args){
   try{
  //try block contains set of statements where an exception can occur 
//sensitive Code 
  int b =0;
  int a =100/b;
  System.out.println(a);
  }
   // catch 
  //try block always followed by catch block
// we can use multipule catch block  for  single try block 
// if we wnant to know about which type of exception occur . then we have to copy that exception on cath block 
    

catch (ArithmeticException e){
  System.out.println(e.getMessage());
    }
//Rest of code!
System.out.println("Done!");

throw keyword__
//Comp have standred type of exceptions .we have to create exception then we use throw keyword 
//


//stack overflow exception ------
a=10;
void stackoverFlowError(int a){
while(a<o){
a++;
stackOverFlowError(a);
}

} catch(Exception e){
System.out.println(e.getMessage());
}
System.out.println("Done!"); 


//Index out  of bound error--


int[] mynumber = {1,2,3};
System.out.println(myNumbers[10]);


Finally ___
