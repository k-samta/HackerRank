package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PickingNumbers {
	public static int pickingNumbers(List<Integer> a) {

		/*Map<Integer,Integer> hm = new HashMap<>();
		 Collections.sort(a);
		  for(Integer n : a)
		  {
			  if(hm.containsKey(n))
			  {
				  hm.put(n, hm.get(n)+1);
			  }
			  else hm.put(n,1);
		  }
		  List<Integer> count = new ArrayList<>() ;
		  int j=0;
		 for(Entry<Integer,Integer> e : hm.entrySet())
		 {
			 for(int i=1;i<a.size();i++)
			 {
				 if(Math.abs(e.getKey()-a.get(i))<=1&&e.getKey()!=a.get(i))
				 {
					 count.add(e.getValue()+hm.get(a.get(i)));
					// System.out.println("e.getValue() :"+e.getValue()+"  hm.get(a.get(i)) :"+hm.get(a.get(i)));
				 }


			 }
		 }
		 Collections.sort(count);
		 return count.get(count.size()-1);*/
	/*int  max=0;
		Collections.sort(a);
	//	for(int i=0;i<a.size()-1;i++)
		{int count =0;
			for(int j=0;j<a.size()-1;j++)
			{
				if(Math.abs(a.get(j)-a.get(j+1))<=1)
				{
				//	System.out.println(a.get(i)+ "            "+a.get(i+1));
				//	System.out.println(count);
					count++;
				}
				if(count>max)
					max=count;
			}
			if(count>max)
				max=count;
			
		}
		return max;*/
		
		/*   int[] count=new int[a.size()-1];
			Collections.sort(a);
	        for(int i=0;i<a.size()-1;i++){
	        	ArrayList<Integer> arr = new ArrayList<Integer>();
	        	System.out.println("a.get(i) "+a.get(i));
	            arr.add(a.get(i));
	            for(int j=i+1;j<a.size();j++){
	                if(Math.abs(a.get(i)-a.get(j))<=1){
	                    arr.add(a.get(j));       
	                    System.out.println("a.get(j) "+a.get(j));
	                }
	            }
	            count[i]=arr.size();
	        }
	        Arrays.sort(count);
	        return count[count.length-1];*/
		
		 /* Save counts of each number */
		
        int[] counts = new int[100];
    //    List<Integer> count = new  LinkedList<>();
		  for(Integer n : a)
		  {
			//  count.add(count.get(n)+1);
	            counts[n]++;
		  }
        
        /* Find adjacent pair with largest sum */
        int result = 0,c=0;
        for (int i = 1; i < counts.length; i++) {
          //  c = counts.get(i) + counts.get(i-1);
        	  c = counts[i] + counts[i-1];

            result = Math.max(result,c);
        }
        return result;
				     	
	}

	public static void main(String[] args) throws IOException {
		List<Integer> a = new ArrayList<>();
		a.add(4);
		a.add(6);
		a.add(5);
		a.add(3);
		a.add(3);
		a.add(1);
		//4 6 5 3 3 1
		System.out.println(pickingNumbers(a));
	}
}
