package Assignment_01;

/*
Q10. WAP in Java Program To Survey Four Different Car Models For Four
Different Cities:
Your job is to find out the total number of cars sold of each model in all
the cities. Use Array of objects or multiple objects of class name City.
 */
import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Models Delhi = new Models();
		System.out.println("In Dehli...");
		Delhi.setter();
		
		Models Mumbai = new Models();
		System.out.println("In Mumbai...");
		Mumbai.setter();
		
		Models Chennai = new Models();
		System.out.println("In Chennai...");
		Chennai.setter();
		
		Models Kolkata = new Models();
		System.out.println("In Kolkata...");
		Kolkata.setter();
		
		int s1 = Delhi.M_K10 + Mumbai.M_K10 + Chennai.M_K10 + Kolkata.M_K10;
		System.out.println("Total number of Maruti-K10 models: " + s1);
		
		int s2 = Delhi.Z_Asteta + Mumbai.Z_Asteta + Chennai.Z_Asteta + Kolkata.Z_Asteta;
		System.out.println("Total number of Zen-Asteta models: " + s2);
		
		int s3 = Delhi.Wagnor + Mumbai.Wagnor + Chennai.Wagnor + Kolkata.Wagnor;
		System.out.println("Total number of Wagnor models: " + s3);
		
		int s4 = Delhi.M_SX4 + Mumbai.M_SX4 + Chennai.M_SX4 + Kolkata.M_SX4;
		System.out.println("Total number of Maruti-SX4 models: " + s4);
				

	}

}

class Models{
	int M_K10;
	int Z_Asteta;
	int Wagnor;
	int M_SX4;
	
	Scanner sc = new Scanner(System.in);
	
	void setter() {
		System.out.print("Enter no. of models of Maruti-K10: ");
		M_K10 = sc.nextInt();
		
		System.out.print("Enter no. of models of Zen Asteta: ");
		Z_Asteta = sc.nextInt();
		
		System.out.print("Enter no. of models of Wagnor: ");
		Wagnor = sc.nextInt();
		
		System.out.print("Enter no. of models of Maruti-SX4: ");
		M_SX4 = sc.nextInt();
		
		System.out.println();
	}
}