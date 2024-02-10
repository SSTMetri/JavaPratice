package examples_all;

import java.util.Map;
import java.util.TreeMap;

public class Leap2 
{
	public static void main(String[] args) {
		// year to be checked
	    int year = 200;
	    boolean leap = false;

	    // if the year is divided by 4
	    if (year % 4 == 0) {
	      // if the year is century
	      if (year % 100 == 0) {
	        // if year is divided by 400
	        // then it is a leap year
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      } 
	      // if the year is not century
	      else
	        leap = true;
	    }
	    else
	      leap = false;
	    if (leap)
	      System.out.println(year + " is a leap year.");
	    else
	      System.out.println(year + " is not a leap year.");
   
	    int y=150;
	    boolean f;
	    if(y%4==0) {
	    	if(y%100==0) {
	    		if(y%400==0) {
	    			f=true;
	    		} else {
	    			f=false;
	    		}
	    		
	    	} else {
	    		f=true;
	    	}
	    	
	    } else {
	    	f=false;
	    }
	    
	    
	    if(f==true) {
	    	System.out.println(y+" is leap year");
	    } else {
	    	System.out.println("Not leap year");
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
