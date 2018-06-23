package com.Fidoop.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.Fidoop.DAOFactory.PoolingDAO;

public class Items_Mapreduce 
{
	
	public static ArrayList<String> ItemCodescount()
	{
		
	
	//Checking bill number respective customer id
	HashMap<Integer, ArrayList<String>> map1=new HashMap<Integer, ArrayList<String>>();
	map1=PoolingDAO.getItemCodes();
	ArrayList<String> list=new ArrayList<String>();
	ArrayList<String> list1=new ArrayList<String>();
  	   if(map1.size()>0)
    	{
     	  
           for(Map.Entry m4:map1.entrySet())  
            {
	      	   m4.getKey();
	      	  String values = m4.getValue().toString();
	
	      	  String first=values.replace("[", "").replace("]", "");
	      	  String a[]=first.split("~~");
	      	  String i_billno=a[0];
	      	  String i_cust_id=a[1];
	      	  String itemset=a[2];
	      	  String i_country=a[3];
	      	  String arr[]=itemset.split("-");
	      	  for(int i=0;i<arr.length;i++)
	      	  {
	      		  list.add(arr[i]);
	      	  }
	      	  
      	
          }
      
      
      }
			  	Set<String> unique = new LinkedHashSet<String>(list);
			  	for (String key : unique)
			  	{
			  	    System.out.println(key + ": " + Collections.frequency(list, key));
			  	}
			  	
			  	System.out.println("===========itemset=====Count Greater than or equal to 2===========");
			  	
			  	for (String key : unique)
			  	{
			  		if(Collections.frequency(list, key)>=2)
			  		{
			  	    System.out.println(key + ": " + Collections.frequency(list, key));
			  	    list1.add(key);
			  		}
			  	}
  	
	
  	
  	
	return list1;
    	}



	public static boolean itemsetmapreduce(ArrayList<String> list)
	{
		//Checking bill number respective customer id
		HashMap<Integer, ArrayList<String>> map1=new HashMap<Integer, ArrayList<String>>();
		map1=PoolingDAO.getItemCodes();
		
		System.out.println("------"+list);
	  	   if(map1.size()>0)
	    	{
	     	  
	           for(Map.Entry m4:map1.entrySet())  
	            {
	        	   ArrayList<String> list1=new ArrayList<String>();
		      	   m4.getKey();
		      	  String values = m4.getValue().toString();
		          StringBuffer sb=new StringBuffer();
		      	  String first=values.replace("[", "").replace("]", "");
		      	  String a[]=first.split("~~");
		      	  String i_billno=a[0];
		      	  String i_cust_id=a[1];
		      	  String itemset=a[2];
		      	  String i_country=a[3];
		      	  String arr[]=itemset.split("-");
		      	  for(int i=0;i<arr.length;i++)
		      	  {
		      		  list1.add(arr[i]);
		      	  }
		      	  
		      	  System.out.println("the list1--"+list1);
		      	for(int counter = 0; counter < list1.size(); counter++)
		      	{
		      		
		      	    if(list.contains(list1.get(counter))) 
		      	    {
		      	    	sb.append(list1.get(counter));
		      	    	sb.append("-"); 
		      	    	
		      	    	//String str=sb.toString();
		      	    	
		      	    	//String index1=str.lastIndexOf(str)
		      	    	
		      	     }
		      	    
		      	    else
		      	    {
		      	    	
		      	    }
		      	    
		      	  }

		      	 System.out.println("==============SB +======================================"+sb.toString()); 
		      	 
		      	 String itemcode=null;
		      	 itemcode=sb.toString();
		      	 
		      	 if(!itemcode.equals(""))
		      	 {
		      		boolean flag=PoolingDAO.Update_mapreduce(i_billno, i_cust_id,itemcode, i_country);
			      	
			      	System.out.println("//////flag///////"+flag);
			      	 
		      	 }
		      	
		      	
		      	 
	      	
	          }
	          
	          
	      
	      
	      }
	  	  
	  	  
	
	  	 return true;
	  	   
	}

}
