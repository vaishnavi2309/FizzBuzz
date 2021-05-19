package program2;
import java.util.Scanner;

import Test.FizzBuzz;

public class FizzBuzzMain {
public static String fizzBuzz(int n) {

        if (n % 3 == 0 && n % 5 == 0) { //multiple of 3 & 5
        	return "FizzBuzz";
        } else if (n % 3 == 0) { //multiple of 3
        	return "Fizz";
        } else if (n % 5 == 0) { //multiple of 5
        	return "Buzz";
        } else {
        	return String.valueOf(n);
        }

   
}

 
    public static void main(String[] args) {
    	
    	
    	Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int i=s.nextInt();
   
        System.out.println(fizzBuzz(i));
    
        //for ( int i = 1; i <= 100; i++) {
        	 //System.out.println(FizzBuzz.getVal(i));
       // }
        
    }
}