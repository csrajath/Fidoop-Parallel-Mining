package com.Fidoop.Main;

import java.util.Arrays;
import java.util.Comparator;

public class Test
{

	/**
	 * @param args
	 */
	
		public static void main(String[] args)
		  {
			StringBuffer sb=new StringBuffer();
		    String string = "26-29-28-31-30-34-35-32-33-38-39-36-37-42-43-40-41-46-47-44-";
		    String[] numbers = string.split("\\D+");
		    Arrays.sort(numbers, new Comparator<String>()
		    {
		      public int compare(String s1, String s2)
		      {
		        return Integer.valueOf(s1).compareTo(Integer.valueOf(s2));
		      }
		    });
		    System.out.println(Arrays.toString(numbers));
		    
		    String arr[]=Arrays.toString(numbers).split(",");
		    for(int i=0;i<arr.length;i++)
		    {
		    	//arr[i]=arr
		    	sb.append(arr[i].trim());
		    	sb.append("-");
		    }
		    
		    System.out.println(""+sb.toString());
		    
		  }

	

}
