package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution_16 {
	  // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    	int len = apples.length>oranges.length?apples.length:oranges.length;
    	int ap=0 , or=0 ;
    	for (int i =0; i<len; i++ ) {
    		if(i<apples.length)
    		{
    			apples[i]=apples[i]+a;
    			if(apples[i]>=s&&apples[i]<=t)
    				ap++;
    			//System.out.println( apples[i]+"a  ");
    		}
			
    		if(i<oranges.length)
			{
    			oranges[i]=oranges[i]+b;
    			if(oranges[i]<=t&&oranges[i]>=s)
    				or++;
    		//	System.out.println( " b "+oranges[i]);
			}
		}
    	System.out.println(ap);
    	System.out.println(or);


    }
    static int birthday(List<Integer> s, int d, int m) {
    	long sum =0;
    	int count=0;
    	for(int i=0 ;i<m;i++)
    		sum=sum+s.get(i);
    	if(sum==d)
			count++;
    	for(int i=m;i<s.size();i++)
    	{
    			sum=sum+s.get(i)-s.get(i-m);
    			if(sum==d)
        			count++;
    	}
		return count;
    }
   private static  Map<Integer,Integer> hm = new HashMap<>();
   /* static{
    	 for (int i = 0; i < hm.size(); i++) {
    			hm.put(i, 0);
    		}
    	
    }*/
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
    	
    	int in= Integer.MIN_VALUE, pos=0;
    	/*for(Entry<Integer,Integer>e :hm.entrySet())
    	{
    		for (int i = 0; i < arr.size(); i++) {
    	    	if(e.getKey()==arr.get(i))
    	    	{
    	    		hm.put(e.getKey(), e.getValue()+1);
    	    		if(e.getValue()>in);
    	    		pos=e.getKey();
    	    	}
    	    		
    	    	}
    	    }*/
    	
    	for(Integer index : arr)
    	{
    		if(hm.containsKey(index))
    		{
    			hm.put(index,hm.get(index)+1);
    			if(hm.get(index)>in)
    				{
    					pos=index;
    					in=hm.get(index);
    				}
    		}
    		else
    			hm.put(index, 1);
    	}
    	for(Entry<Integer,Integer>e :hm.entrySet())
    	{
    		System.out.println(e.getKey()+"  "+e.getValue());
    	}
    	return pos;
    }
    
    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
   	if(x2>x1&&x2>1000&&x1>1000&&v1<1&&v1>1000&&v2<1&&v2>1000)
    	{	return "NO";
    	
    	}
    	else
    	{ 
    		long f=x1+v1,f1=x2+v2;
    		for(int i=0;i<=10000;i++)
    		{
    			if(f==f1){
    				return "YES";
    			}
    			else
    			{
    				f=f+v1;
    				f1=f1+v2;
    				System.out.println(f+" "+f1);
    			}
    		}
    	}
    	return "NO";
    	
    	/*  if(x1>1000&&x2>1000&&x1>1000&&v1<1&&v1>1000&&v2<1&&v2>1000)
          {    return "NO";
          
          }
          int f= (v2-v1)%(x2-x1);
               if( f==0)
                   return "YES";
          return "NO";*/

    }

    public static void main(String[] args) {
    	int[] a={-2, 2, 1}; 
    	int[] o= {5 ,-6};
      //  countApplesAndOranges(7, 11, 5, 15,a , o);
        
        
        
    	Integer[] s={1, 2, 1, 3, 2}; 
      //  System.out.println(birthday(Arrays.asList(s), 3, 2));
        
        Integer[] arr={1, 2, 3 ,4 ,5, 4,3,2,1,3,4}; 
    //    System.out.println(migratoryBirds(Arrays.asList(arr)));
        
        System.out.println(kangaroo(2081, 8403, 9107 ,8400));
    }
}


