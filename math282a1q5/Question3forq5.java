package math282a1q5;

import java.util.Iterator;
import java.util.Scanner;


public class Question3forq5 
{
	//here is the method for rough estimate... answer of question 1 a.	Implement a method to calculate the rough estimate for the square root of a number using double values. You can use the quick process above or a better process described by Wikipedia, or another process if you find one.
	
	public static double estimate( double S )
	{
		double Estimate = 1.0;
		double D = java. lang. Math. log10(S); 
		Estimate = Math.pow(10, D/2);
		
		//System.out.println(Estimate);
		
		return Estimate;
	}
	
	
	//================ here is the answer of question 2 : b.	Write a method to calculate square roots using the Babylonian method using double values, but modify it to accept an initial value to use for the first guess and to display the number of loops required by the method
	
	 public static  double sqrt(double x, double Guess, double precision)
	    {
	        double guess = 0d;
	        double oldGuess = 0d;
	        if(x<0) return -1;
	        guess = Guess;
	        double loopCount = 0;
	        System.out.println("initial guess :" + guess);
	        boolean keepGoing = true;
	        while(keepGoing)
	        {
	        	
	            oldGuess = guess;
	            guess = (oldGuess+x/oldGuess)/2;
	            if(Math.abs(oldGuess-guess)<=precision) keepGoing = false;
	            loopCount++;
	            //System.out.println(loopCount+" ----> "+guess);
	        }
            System.out.println("number of loops required is "+loopCount);

	        return guess;
	    }
	 
	 
	 //c.	Using the modified Babylonian method, calculate the square root of 4.9 × 10i for every value of i from -10 to 10. Use a precision of 0.00001. Do one run using a starting value of 1 and one run using a starting value provided by the rough estimate. Display the answers calculated by each method, along with the answer provided by the built-in square root method in Java.  [2 marks
	 
	 public static void display () 
	 {
		for (int i = -10; i < 11; i++)
		{
			System.out.println( "square root of 4.9 * Math.pow(10, "+ i +") is " +  sqrt(4.9 * Math.pow(10, i), 1 ,0.00001));
			System.out.println("=====================================================");
			System.out.println( "square root of 4.9 * Math.pow(10, "+ i +") is " +  sqrt(4.9 * Math.pow(10, i), estimate(4.9 * Math.pow(10, i)) ,0.00001));
			System.out.println("=====================================================");
			System.out.println( "square root of 4.9 * Math.pow(10, "+ i +") is " +  Math.sqrt(4.9 * Math.pow(10, i)));
			System.out.println("=====================================================");
			System.out.println("=====================================================");

			
		}
	 }
	 
	 public static void main(String[] args)
	    {
	    	display();


	    }

}

