package com.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.Fidoop.DAOFactory.PoolingDAO;
import com.FPgrowth.*;

public class GetInvoiceRead 
{
	public static boolean Itemlistread(String root) throws IOException
	{
		
	
	//Checking bill number respective customer id
	HashMap<Integer, ArrayList<String>> map_tclaim=new HashMap<Integer, ArrayList<String>>();
  	map_tclaim=PoolingDAO.getInvoiceno();
  	
  	FileWriter fstream = new FileWriter(root+"/"+"test1.txt", true);
    BufferedWriter out1 = new BufferedWriter(fstream);
    File ff=new File(root);
    
    if (!ff.exists()) 
         {
           ff.mkdirs();
         }
    File f2=new File(root+"/"+"test1.txt");
    
    if (!f2.exists()) 
         {
           f2.createNewFile();
         }
  	if(map_tclaim.size()>0)
    	{
     	  
        for(Map.Entry m4:map_tclaim.entrySet())  
        {
        StringBuffer sb=new StringBuffer();
      	  m4.getKey();
      	  String values = m4.getValue().toString();

      	  String first=values.replace("[", "").replace("]", "");
      	  String a[]=first.split("~~");
      	  
      	  boolean checkflag=false;
      	  checkflag=PoolingDAO.checkinvoice(a[0].trim());
      	  
      	  if(!checkflag)
      	  {
      		String itemcodes=PoolingDAO.getItemcodes(a[0].trim(),a[1].trim(),a[2].trim());
      		String item=Test.countWords(itemcodes);
      		boolean flag1=PoolingDAO.insert_to_mbill(a[0].trim(),a[1].trim(),item,a[2].trim()); 
      		sb.append(a[0].trim());
      		sb.append("~~");
      		sb.append(a[1].trim());
      		sb.append("~~");
      		sb.append(itemcodes);
      		sb.append("~~");
      		sb.append(a[2].trim());
      		sb.append("~~");
      		
      		out1.write(sb.toString());
			out1.newLine();
      		
      	  }
    
      	
        }
       
      
      }
  	 out1.close();
  	
  	
  	
  	
  	
	return true;
   }
	
	
	
	
	
}
