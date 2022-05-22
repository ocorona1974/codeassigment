package schoolwork;

import java.util.Arrays;

public class codingassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int values [] = { 3, 9, 23, 64, 2, 8, 28, 93 } ;
		System.out.println(values[6 + 1] - values [0]);
	int total = 0;	
		for( int sum : values ) {
			total += sum ;
	}	
	int average = total / values.length;
		System.out.println(average);
	
	String names [] = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
	int sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
	  }
	 average = sum / names.length;
	    System.out.println("Averega letter pre name [4] = " + average);
	 
	 String namesTogether = "";
	 	for( int i = 0; i < names.length; i++) {
	 		namesTogether += names[i] + " ";
	 	}
	    System.out.println(namesTogether);
	    
	   // System.out.println(name of the array[total of elements - 1]);
	   
	   // System.out.println(name of the array [0]);
	    
	    int nameLengths [] = new int [names.length];
	      for(int i =0; i < names.length; i++) {
	    	  nameLengths [i] = names[i].length();
	      }
	    int allLetters = 0;  
	     for(int i = 0; i < nameLengths.length; i++) {
	    	 allLetters += nameLengths[i];
	     }
	     System.out.println( allLetters);
	 	System.out.println(dulicateWord("Hello" , 3));
	 	System.out.println(createFullName("Ramon", "Ortega"));
	 	
	 	
	}  
	


	public static String dulicateWord(String word, int n) {
		String dulicateWord = "";
		  for(int i = 0; i < n; i++) {
			  dulicateWord += word;
		  }
		return dulicateWord	;	  
	}
	public static String createFullName(String firstName, String lastName) {	
		 return firstName + " " + lastName;
	}
	public static boolean addToSeeIfGraterThan100(int [] number ) {
		return Arrays.stream(number).sum()> 100;
	}
	 public static double getAverage(double[] arr) {
		 return Arrays.stream(arr).average().orElse(Double.NaN);
	}
	 public static boolean whichArrIsBigger(double first[], double second[]) {
		 return getAverage(first) > getAverage(second);
	 }
	public static boolean willBuyDrink(boolean isHotOutSide, double moneyInPocket) {
		if(isHotOutSide && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}}
	public static double getMoney(double bills , double payCheck) {
		double sum = bills - payCheck;
		   return sum;
	// this is a method that would use to see if I have any free money to have a beer.
    //if not I better start looking for change.
		}
	}
	
		
		
		
		
	
	
    
    

