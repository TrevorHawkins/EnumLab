package edu.csc180.enums;
import java.util.Scanner;


public class Calculator{    
	int n1; 
	int n2; 
	int equals; 

	Scanner scan =  new Scanner(System.in); 

	public void Calculate(int number1, int number2){ 
		try{
			System.out.println("enter a number:");
			number1 = scan.nextInt();
			System.out.println("enter another number: ");
			number2 = scan.nextInt();

			System.out.println("Pick a function Add,Subtract,Multiply or Divide: ");
			String theInput = scan.next();

			if(theInput.equalsIgnoreCase("add")){
				equals = Opperation.Add.impliment(number1, number2);
			} 
			else if(theInput.equalsIgnoreCase("Subtract")){
				equals = Opperation.Subtract.impliment(number1, number2);
			} 
			else if(theInput.equalsIgnoreCase("Multiply")){
				equals = Opperation.Multiply.impliment(number1, number2);
			} 
			else if(theInput.equalsIgnoreCase("Divide")){
				equals = Opperation.Divide.impliment(number1, number2);
			} 
			System.out.println("The result: " + equals); 

		}   
		catch(IllegalArgumentException e){
			System.out.println("Please enter a number");
		}
	}

}

