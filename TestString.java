package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TestString {

    private static Map<String,Integer> hm = new HashMap<>();
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            hm.put(name,phone);
			in.nextLine();
		}
        boolean flag = false;
		while(in.hasNext())
		{
			String s=in.nextLine();
            for(Entry<String, Integer> e : hm.entrySet())
             {
                 if(e.getKey().contains(s))
                 {
                     System.out.println(e.getKey()+"="+e.getValue());
                     break;
                 }
                 else
                    flag= true;
             }
		}
        if(flag)
         System.out.println("Not found");
	}
}
