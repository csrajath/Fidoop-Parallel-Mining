// Program Name	: 	Excel_Upload.java
// Purpose		:	This program is a part of Navis Byes Classification system
// Author		:	Menaka
// Date			:	19-Aug-2016
// Modified by	:
// Date			:
// Purpose		:


package com.Fidoop.util;

import java.sql.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.Fidoop.DAOFactory.PoolingDAO;
public class Excel_upload
{
	
	//// Below code is to upload the content of navy_excel1.xlsx file content to MySQL table db_test
	public static boolean ExcelUpload()
	{
		String Str="";
		int i1=0;
    	boolean flag1=false;
    	
    	try
        {
        	
        	
            FileInputStream file = new FileInputStream(new File("invoice.xlsx"));
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            FileWriter fstream = new FileWriter("test.txt", true);
	        BufferedWriter out = new BufferedWriter(fstream);
            for(Row row : sheet) 
			{
            	
            	StringBuffer sb1= new StringBuffer();
                //For each row, iterate through all he columns
            	 if(i1==0)
 					
 				{
 				
            		row = rowIterator.next();
     				Iterator<Cell> cellIterator = row.cellIterator();
     				
    				i1=1;
 				}
    			else{
    				 
    				for(int cn=0; cn<5; cn++) 
    					   {
    						   Cell cell = row.getCell(cn, Row.CREATE_NULL_AS_BLANK);
    					       // Print the cell for debugging
    					       System.out.println("CELL: " + cn + " --> " + cell.toString());
    					       String pattern = "\\.0+"; // dot followed by any number of zeros
    					       String pattern1 = "\\'+";
    					       String pattern2 = "\\`+";
    					      
    					       if (cn==0||cn==1||cn==2||cn==3||cn==4||cn==5)
    					       {
    					    	   if(cell.toString().isEmpty())
    					    	   {
    					    		   sb1.append("null");
    					    	   }
    					       }
    					       String str=cell.toString().replaceAll(pattern, "");
    					       String str2=str.replaceAll(pattern1, "");
    					       String str3=str2.replaceAll(pattern2, "");
    					       sb1.append(str3);
    					      /* sb1.append(cell.toString().replaceAll(pattern1, ""));
    					       sb1.append(cell.toString().replaceAll(pattern2, ""));*/
    					       sb1.append("~~");
    					       
    					   }
    					   StringBuffer buf = null;
    					   String ss=sb1.toString();
    					   String[] splits = ss.split("~~");
    				         
    			           String part1 = splits[0]; 
    			           String part2 = splits[1]; 
    			           String part3 = splits[2];
    			           String part4 = splits[3];
    			           String part5=splits[4];
    			           
    						
    						
    						System.out.println("part 1 is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+part1);
    						System.out.println("part 2 is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+part2);
    						
    						System.out.println("part 3 is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+part3);
    						
    						System.out.println("part 4 is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+part4);
    						
    						System.out.println("part 5 is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+part5);
    						
    						flag1=PoolingDAO.addReviewDetails(part1,part2,part3,part4,part5);
    						
    						out.write(sb1.toString());
    						out.newLine();
    						
    					
                }
            
                System.out.println("");
                
                
                
            }
            file.close();
            out.close();
           
            HashMap<Integer, ArrayList<String>> map_tclaim=new HashMap<Integer, ArrayList<String>>();
         	map_tclaim=PoolingDAO.itemslist();
         	
         	if(map_tclaim.size()>0)
           	{
            	  
               for(Map.Entry m4:map_tclaim.entrySet())  
               {
             	  m4.getKey();
             	  String values = m4.getValue().toString();

             	  String first=values.replace("[", "").replace("]", "");
             	 String a[]=first.split("~~");
             	
             	
             
            String ref_i_code= a[0].trim();
            String i_name=a[1].trim();
            
            
            flag1=PoolingDAO.insertClass(ref_i_code,i_name);
             
             
             }
           	}
            


	}	
    catch(Exception e)
    {
    	e.printStackTrace();
    }
		return flag1;
	
	
	}
}
