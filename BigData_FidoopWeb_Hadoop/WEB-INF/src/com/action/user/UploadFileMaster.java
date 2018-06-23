/**
 * 
 */
package com.action.user;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import com.Fidoop.DAOFactory.PoolingDAO;
import com.Fidoop.util.GetInvoiceRead;
import com.Fidoop.util.Items_Mapreduce;





public class UploadFileMaster extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException
			{
		PrintWriter out = response.getWriter();
		LinkedHashMap<String, String> data1 = new LinkedHashMap<>();	
		String username=null;
		String fileName=null;
		 boolean flag111=false;
		try 
		{
			int success=0;
			int totrow=0;
			int error=0;
			
			HashMap<String, String> hm = new HashMap<String, String>();
		     
			
			
			
		
			RequestDispatcher rd = null;
			
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		
		
			if (isMultipart)
			{
				FileItemFactory factory = new DiskFileItemFactory();
				ServletFileUpload upload = new ServletFileUpload(factory);
				try 
				{
					List items = upload.parseRequest(request);
					Iterator iterator = items.iterator();
					
					int s=items.size();
					
					
					
					
					for(int j=0;j<s;j++)
					{
						FileItem one =(FileItem)items.get(j);
						one.getFieldName();
						String str=one.getContentType();
					
						if(str=="application/octet-stream")
						{
							
							
						}
					 
							  data1.put(one.getFieldName().toString(), one.getString().toString());
					
					}
					username = (String) data1.get("adminid");
				
					  
					while (iterator.hasNext())
					{
						FileItem item = (FileItem) iterator.next();
						long size=item.getSize();
						if (item.isFormField())
						{
							/*name[i] = item.getString();
							i++;*/
							
						}
						
						else if(size==0)
						{
							  rd=request.getRequestDispatcher("uploadexcel.jsp?no1=0&no=3");
								rd.forward(request, response);
						}
						else 
						{
							File file23 = new File("/UploadedExcel");
							String path = file23.getAbsolutePath();
							
							
							 fileName = item.getName();
						
						     
							String root = request.getRealPath("/UploadedExcel");
						
						
							File uploadedFile = new File(root +"/"+fileName);
							 File ff=new File(root);
	                         if (!ff.exists()) 
	                              {
	                                ff.mkdirs();
	                              }
							
							item.write(uploadedFile);
							
					
						}
				
					}
					
					try
			        {
			        	int i1=0;
			        	//String root = request.getRealPath("/ExcelToText");
			        	
			            FileInputStream file = new FileInputStream(new File(request.getRealPath("/UploadedExcel"+"/"+fileName)));
			 
			            //Create Workbook instance holding reference to .xlsx file
			            XSSFWorkbook workbook = new XSSFWorkbook(file);
			 
			            //Get first/desired sheet from the workbook
			            XSSFSheet sheet = workbook.getSheetAt(0);
			 
			            //Iterate through each rows one by one
			            Iterator<Row> rowIterator = sheet.iterator();
			            
			        
			            
			           
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
			    						
			    						boolean flag1=PoolingDAO.addReviewDetails(part1,part2,part3,part4,part5);
			    						
			    						
			    					
			                }
			            
			                System.out.println("");
			                
			                
			                
			            }
			          
			            
			           
			            
			            
			           
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
			            
			            
			            boolean flag1=PoolingDAO.insertClass(ref_i_code,i_name);
			             
			             
			             }
			           	}
			            
			         	boolean flag1=GetInvoiceRead.Itemlistread(request.getRealPath("") + "/ExcelToText/");
			    		System.out.println("<<<<<<<<---------<tclaim>------------>>>>>>>>>>"+flag1);
			    		
			    		 ArrayList<String> list=new ArrayList<String>();
			    		
			    		 list=Items_Mapreduce.ItemCodescount();
			    		 System.out.println("--------the list2"+list);
			    		 
			    		 
			    	//	boolean flag=Items_Mapreduce.itemsetmapreduce(list);

				}	
			    catch(Exception e)
			    {
			    	
			    }
					
					
					
					 //======================Hadoop Storage starts============================
		            
		            try
		    		{
		    		 String filePath =request.getRealPath("") + "/" +"config.properties";

		    			
		    			System.out.println("filepath upload is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+filePath);
		    			FileInputStream fileInputStream = new FileInputStream(new File(
		    					filePath));
		    			Properties properties = new Properties();
		    			properties.load(fileInputStream);

		    			Configuration conf = new Configuration();
		    			conf.addResource(new Path(properties.getProperty("hadoopLoc")));
		    			FileSystem fs = FileSystem.get(conf);
		    			Path pt = new Path(properties.getProperty("hdfsLoc"));

		    			Path src = new Path(request.getRealPath("") + "/ExcelToText/" +"test1.txt");
		    			
		    		
		    			fs.copyFromLocalFile(src, pt);
		    			
		    			
		    			
		    		}
		    		catch (Exception e) 
		    		{
		    			
		    		}
		            
		            //======================Hadoop Storage ends============================
					
					
					
				}
				catch (Exception e) 
				{
					
					
				}
			}
			
			
			
			boolean flag=PoolingDAO.truncatembill();
			File f=new File(request.getRealPath("") + "/ExcelToText/" +"test1.txt");
			
			 if (f.exists()) 
	         {
	           f.delete();
	         }
			
			rd=request.getRequestDispatcher("/Files/JSP/User/uploadfiles.jsp?no=1");
			rd.forward(request, response);
			
			
		}
		catch (Exception e)
		{
			
		}
			}
}
