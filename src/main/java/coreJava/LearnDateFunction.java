package coreJava;
import java.util.*;  // class having access to Date class methods

public class LearnDateFunction {
	// Java Program explaining util.date class methods//
	// use of .toString(), setTime(), hashCode() methods
	
	    public static void main(String[] args)
	    {
	        Date mydate = new Date();
	  
	        // Displaying the current date and time
	        System.out.println("System date : "+ mydate.toString() );
	  
	        // Is used to set time by milliseconds. Adds 15680 
	        // milliseconds to January 1, 1970 to get new time.
	        mydate.setTime(15680);
	  
	        System.out.println("Time after setting:  " + mydate.toString());
	  
	        int d = mydate.hashCode();
	        System.out.println("Amount (in ms) by which time" + " is shifted :  " + d);
	    }
	}