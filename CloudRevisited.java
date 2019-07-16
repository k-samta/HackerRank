package cdac.medinfo.parse.testcase;

public class CloudRevisited {
	static int jumpingOnClouds(int[] c, int k) {
		int  e = 100;
		
	for(int i=0;i <c.length;i=i+k)
		{
			
				if(c[i]==1)
				{
					e=e-2;
				}
				e=e-1;
				
				// i=(i+k)%(c.length);
				
		}	
		
		/*do
		{
		    if(c[i]==1)
		        e=e-2;
		    e=e-1;
		    i=(i+k)%(c.length);
		}
		while(i!=0);*/
		return e;
    }
	public static void main(String[] args) {
		
		int []c ={0, 0, 1, 0, 0 ,1, 1, 0};
		System.out.println( jumpingOnClouds(c, 2));
	}

}
