package edu.csc180.enums;
import java.util.Scanner;



public class Main {  
	static int n1; 
	static int n2; 
	private static Calculator cal = new Calculator();  
	private static Scanner scan = new Scanner(System.in); 

	public static void main(String[] args) {   
		boolean isNotRunning = false;

		System.out.println("Welcome to the awesome calculator program"); 
		System.out.println("Press Enter to continue or done at any time to end the program");
		while(!isNotRunning){  
				
			String input = scan.nextLine(); 
			if(input.equalsIgnoreCase("done")){
				isNotRunning = true; 
				scan.close();
			} 
			
			else
				cal.Calculate(n1, n2);
		}
		scan.close();	
	}

}