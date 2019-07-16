package test;

import java.io.IOException;


public class Leap {
	 // Complete the dayOfProgrammer function below.
	static	String dayOfProgrammer(int year) {

				/*if( year == 1918 ) 
					return "26.09.1918";
				else  if( year > 1918 && year % 4 == 0 ||!(year % 100 == 0)&& year % 4 == 0|| year % 400 != 0&& year % 4 == 0  ) 
					return "12.09." +  year;
	            else 
	            	{if(year<1918)
	            		  if  (year % 4 == 0)
	    		    	return "12.09." +  year;
	         	else 
            		return "13.09." + year;
	            	}
        		return "13.09." + year;*/


        		if(year%4==0 && year!=1918)
        		{
        		    if(year%100==0 && year!=1800)
        		    {
        		        if(year%400==0 || year==1700 || year==1900)
        					return "12.09." +  year;
        		        else
        	        		return "13.09." + year;
        		    }else
    					return "12.09." +  year;
        		}else if(year!=1918){
            		return "13.09." + year;
        		}
        		else
					return "26.09.1918";
        		
        		
		}

			
	public static void main(String agr[]) throws IOException
	{
		
		System.out.println(dayOfProgrammer(1800));
	}
}
