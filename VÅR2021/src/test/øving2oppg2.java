package test;

import java.lang.*;

public class øving2oppg2 {	
	
	public static void tid(long n) 
	{
		

		System.out.println(System.currentTimeMillis());
		long k = 0;
		for (int i = 0; i < n; i++) {
			k = k + 5;
		}
		System.out.println(System.currentTimeMillis());
		
	}
	
	public static void main(String[] args) 
	{
		
//		tid(100000000L);
//		tid(1000000000L);
		tid(10000000000L);

	}

}
