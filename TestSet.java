package test;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TestSet {
	 private static Map<String,Integer> hm = new HashMap<>();
	 
	 
	 
	 
	private static void  checkString(String a, String b)
	{
		System.out.println(a.length()+b.length());
		int c= a.length()<b.length()?a.length():b.length();
		if(a.compareToIgnoreCase(b)<0)
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.println("Yes");
	
		System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+b.substring(0,1).toUpperCase()+b.substring(1));
		
		
			 
			 for(Entry<String, Integer> e : hm.entrySet())
			 {
				 if(e.getKey().contains(s))
				 {
					 System.out.println(e.getKey()+"="+e.getValue());
				 }
				 else
					 System.out.println("Not found");
			 }
		 

	}

	static Scanner sc = new Scanner(System.in);
	public static void main(String agr[]) throws IOException
	{
		Set set = new HashSet<>();
		int n = sc.nextInt(); 
		for(int i=0 ;i<n;i++)
		{
			set.add(sc.next());
			System.out.println(set.size());
		}
	}
}
