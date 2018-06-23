/**
 * 
 */
package com.action.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import com.FPgrowth.AlgoFPGrowth;
import com.FPgrowth.Test;
import com.Fidoop.DAOFactory.PoolingDAO;
import com.Fidoop.util.Items_Mapreduce;

import com.util.Utility;



public class ReadFileFromHadoopfiut extends HttpServlet 
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		
		
		PrintWriter out = response.getWriter();
		ArrayList<String> list=new ArrayList<String>();
		
		try
		{
			
			 boolean finalflag=false;
			String submit=request.getParameter("submit");
			//String name=request.getParameter("name");
			System.out.println("submit---"+submit);
			//System.out.println("name----"+name);
			boolean result=false;
		
			RequestDispatcher rd=null;
			 if(submit.equals("get"))
			{
				  
				rd=request.getRequestDispatcher("/Files/JSP/User/recievefromhadoopfiut.jsp");
				rd.forward(request, response);
			}
			 if(submit.equals("fetch"))
				{
				 
				int noofrecords=Integer.parseInt(request.getParameter("noofrecords"));
				 double support=Double.parseDouble(request.getParameter("support"));
				 
				 
				 double d = (double) noofrecords;
				 
			double finalsupport=	d*support;
			Double ds = finalsupport;
			Integer finalsupportt = ds.intValue(); 
				 
				 int counter=0;
				 int counter2=0;
				 System.out.println("=====counter========"+counter);
				 System.out.println("=====noofrecords========"+noofrecords);
				
				 
				 String filePath = request.getRealPath("") + "/" + "config.properties";
					
					filePath = request.getRealPath("") + "/" + "config.properties";
					System.out.println("fielpath is download >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+filePath);
					FileInputStream fileInputStream = new FileInputStream(new File(
							filePath));
					Properties properties = new Properties();
					properties.load(fileInputStream);

					Configuration conf = new Configuration();
					conf.addResource(new Path(properties.getProperty("hadoopLoc")));
					FileSystem fs = FileSystem.get(conf);
					Path pt = new Path(properties.getProperty("hdfsLoc")+"/test1.txt");

					//===================================
					 FSDataInputStream in = fs.open(pt);
					 FSDataInputStream in2 = fs.open(pt);

					    BufferedReader br = new BufferedReader(new InputStreamReader(in));
					    BufferedReader br2 = new BufferedReader(new InputStreamReader(in2));
					    String line = null;
					    while((line = br2.readLine())!= null)
					    {
					    	
					    	
					    	counter2++;
					        
					    }
					    if(noofrecords>counter2)
						{
							rd=request.getRequestDispatcher("/Files/JSP/User/recievefromhadoopfiut.jsp?no=1");
							rd.forward(request, response);	
						}
					    else
					    {
					    	boolean flag=PoolingDAO.truncatembillfiut();
					    	
					    while((line = br.readLine())!= null)
					    {
					    	
					    	if(counter<noofrecords)
					    	{
					    	//	System.out.println(counter+"===="+line);
					    		String arr[]=line.split("~~");
					    		boolean flag1=PoolingDAO.insert_to_mbillfiut(arr[0].trim(),arr[1].trim(),arr[2].trim(),arr[3].trim()); 
					    		
					    		
					    	}
					    	
					    	
					    	counter++;
					        
					    }
					    
					  }
					    long startTimestamp;
			     		long endTimestamp;
			     		startTimestamp = System.currentTimeMillis();
					    
			    		 list=Items_Mapreduce.ItemCodescount();
			    		 System.out.println("--------the list2"+list);
			    		 
			    		 
			         boolean flag=Items_Mapreduce.itemsetmapreduce(list);
			         
			 //  -----------------------------------MAPREDUCETWO- starts-----------------------------------------      
			         
			         if(flag)
			         {
			        	 
			        	 

							int threshold=2;
							ArrayList<String> names_and_numbers = new ArrayList<String>();
							
							ArrayList<String> comparingList1 = new ArrayList<>();
							String countitemm="";
							HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
							int i=0;
							
							
							map=PoolingDAO.getfirstmapreducethings();
							
							
							
						  	   if(map.size()>0)
						    	{
						     	  
						           for(Map.Entry m4:map.entrySet())  
						            {
						        	   ArrayList<String> list1=new ArrayList<String>();
							      	   m4.getKey();
							      	  String values = m4.getValue().toString();
							         
							      	  String first=values.replace("[", "").replace("]", "");
							      	  String a[]=first.split("~~");
							      	  countitemm=a[0];
							      	  
							      	 
							      	  names_and_numbers.add(countitemm);
							
						            }
						           
						           
						           
						           
						           
						           Set<String> uniqueSet = new HashSet<String>(names_and_numbers);
						       	for (String temp : uniqueSet) 
						       	{
						      
						       		
						       		if(Collections.frequency(names_and_numbers, temp)<threshold)
						       		{
						       			
						       			
						       			
						       		}
						       		else
						       		{
						       			
						       			System.out.println(temp+":"+Collections.frequency(names_and_numbers, temp));
						       			String data= temp+":"+Collections.frequency(names_and_numbers, temp);
						       		String[] itemandcount=data.split(":");
						       		
						       	String itemset=	itemandcount[0];
						       	
						       	//System.out.println(""+itemset);
						       	String count=	itemandcount[1];
						       	
						       	System.out.println(""+count);
						       	
						 boolean flagsh=     PoolingDAO.mapreducetwo(itemset,count);
						 
						 System.out.println("flag is >>>>>>>>>>"+flagsh);
						       	
						       	
						       		}
						       		
						       		
						       		
						       		
						       		
						       	}
						     
						} 
			        	 
			        	 
			        	 
			        	 
			        	 
			       
					    
					    
					    
			    	 //  -----------------------------------MAPREDUCETWO- ends-----------------------------------------      	    
					    
			         //  -----------------------------------MAPREDUCETHREE- Starts-----------------------------------------      	  	    
			         
								
								
								
								String itemset="";
							
							String  cout="";
								ArrayList<String> mapreducetwoinput = new ArrayList<String>();
								HashMap<Integer, ArrayList<String>> mapp=new HashMap<Integer, ArrayList<String>>();
								HashMap<Integer, ArrayList<String>> finalfilemap=new HashMap<Integer, ArrayList<String>>();
								HashMap<Integer, ArrayList<String>> finalmap=new HashMap<Integer, ArrayList<String>>();
								HashMap<Integer, ArrayList<String>> finalc=new HashMap<Integer, ArrayList<String>>();
								HashMap<Integer, ArrayList<String>> cou=new HashMap<Integer, ArrayList<String>>();
								String countitem="";
							String co="";
								
								mapp=PoolingDAO.getsecondmapreducethings();
								
								
								
							  	   if(mapp.size()>0)
							    	{
							     	  
							           for(Map.Entry m4:mapp.entrySet())  
							            {
							        	   ArrayList<String> list1=new ArrayList<String>();
								      	   m4.getKey();
								      	  String values = m4.getValue().toString();
								         
								      	  String first=values.replace("[", "").replace("]", "");
								      	  String a[]=first.split("~~");
								      	  countitem=a[0];
								      
								      	 
								      	mapreducetwoinput.add(countitem);
								
							            }
							       //  System.out.println(""+mapreducetwoinput);  
							    	}
								for(int i1=0;i1<mapreducetwoinput.size();i1++)
								{
								String firstitemset=	mapreducetwoinput.get(i1);
								
						 cou=	PoolingDAO.getsecondmapreducecount(firstitemset);
								
						 if(cou.size()>0)
							{
							  
						    for(Map.Entry m4:cou.entrySet())  
						     {
						 	   ArrayList<String> list1=new ArrayList<String>();
						   	   m4.getKey();
						   	  String values = m4.getValue().toString();
						      
						   	  String first=values.replace("[", "").replace("]", "");
						   	  String a[]=first.split("~~");
						   	  co=a[0];
						 
						     }}
						 
						 
						 
							String[] fiestitemarray=	firstitemset.split("-");
						 
						   
							
						   for (int n = 1; n <=fiestitemarray.length; n++) {
						       for (String ngram : ngrams(n, firstitemset))
						       {
						    
						    	   
						    	   if(ngram.length()<2)
						    	   {
						    		   
						    	   }else
						    	   {
						          // System.out.println("ngram is >>>>>>>>>>>>>>>>"+ngram);
						           
						           
						     boolean fkg=    PoolingDAO.insert_to_decomposition(ngram,co);
						        
						         
						    	   }
						       System.out.println();
						   }

						   
						   
						   }
						   
						   
						   
						   
						   
						   
						   
						   
						   
						   
						   
						  
									
									
									
								}
								
								
								
								
								
						         finalc=  PoolingDAO.getfinalitemsets();
						         
						         
						         if(finalc.size()>0)
						     	{
						     	  
						         for(Map.Entry m4:finalc.entrySet())  
						          {
						      	 
						        	   m4.getKey();
						        	  String values = m4.getValue().toString();
						        	  
						        	  System.out.println("values******************"+values);
						           
						        	  String first=values.replace("[", "").replace("]", "");
						        	  String a[]=first.split("~~");
						        	  itemset=a[0];
						            cout=a[1];
						        	
						           // System.out.println("final itemset is >>>>>>>>>>>>>>>>>"+itemset);
						        	//System.out.println("cout itemset is >>>>>>>>>>>>>>>>>"+cout);
						        	 boolean f=    PoolingDAO.insert_to_mapreducethree(itemset,cout);
						        	System.out.println("final insertion is true"+f);
						        	
						        	
						        	
						        	
						        	
						        	
						        	
						        	
						        	
						        	
						        	
						        	
						        	
						        	
						          }
						         
						     
						     	
						     	
						     	} 
						
						         

						         finalfilemap=  PoolingDAO.getreducedfinalitemset();
						         StringBuffer sbb=new StringBuffer();
						         
						         
						         
						         
						         
						         
						         if(finalfilemap.size()>0)
						     	{
						     	  
						         for(Map.Entry m4:finalfilemap.entrySet())  
						          {
						      	 
						        	   m4.getKey();
						        	  String values = m4.getValue().toString();
						        	  
						        	  //System.out.println("values******************"+values);
						           
						        	  String first=values.replace("[", "").replace("]", "");
						        	  String a[]=first.split("~~");
						        	String  fitem=a[0];
						         String   ccont=a[1];
						        	
						         
						             sbb.append(fitem);
						             sbb.append(":");
						             sbb.append(ccont);
						             sbb.append("\n");
						        	
						        	
						        	
						        	
						        	
						        	
						        	
						        	
						        	
						        	
						          }
						         
						         
						         FileWriter fileWriter =
						                 new FileWriter(request.getRealPath("") + "/" + "fiutset.txt");

						             
						             BufferedWriter bufferedWriter =
						                 new BufferedWriter(fileWriter);
						             
						             bufferedWriter.write(sbb.toString());
						           
						            
						             bufferedWriter.close();
						        	
						     	
						     	} 
						      
						         
						         
						         
						         
						 
						         
						         
						         
						         
						         
						         
						         
						         
						         
						         
						         endTimestamp = System.currentTimeMillis();
								
								   float tottime=endTimestamp-startTimestamp;
								   tottime=tottime/1000;
			         
			         
			         
			         
								  

							         boolean flag77=PoolingDAO.insertom_graph_data("FIUT Algorithm",noofrecords,support,tottime);
							         
									   System.out.println("=====finalsupport========"+finalsupportt);
									   	   
								   
								   
								   
								   
								   
						         	
							         finalmap=  	PoolingDAO.chechfinalsupport(finalsupportt);
							         
							         if (finalmap.isEmpty()) {
							        	 
							        	 
							        	 rd=request.getRequestDispatcher("/Files/JSP/User/viewalgo.jsp?no=7");
											rd.forward(request, response); 
							        	 
							        	 
							        	 
							        	
							        	 }
							         
							         else
							         {
							         
							         
							         if(finalmap.size()>0)
								     	{
								     	  
								         for(Map.Entry m4:finalmap.entrySet())  
								          {
								      	 
								        	   m4.getKey();
								        	  String values = m4.getValue().toString();
								        	  
								        	 // System.out.println("values******************"+values);
								           
								        	  String first=values.replace("[", "").replace("]", "");
								        	  String a[]=first.split("~~");
								        	String  idd=a[0];
								         String   set=a[1];
								         String   coont=a[2];
								           
								        finalflag=    PoolingDAO.insert_to_fiutfinal(idd,set,coont);
								        	System.out.println("final insertion is true"+finalflag);
								        	
								        	
								        	
								          }
								         
								     
								     	
								     	
								     	} 
							         
							         
							         
							         
							         }
							         	   
								   
								   
								   
								   
								   
								   
								   
								   
								   
								   
								   
								   
								   
								   
								   
								   
								   
								   
			         
			         if(finalflag)
			         {
			        	
			        	 rd=request.getRequestDispatcher("/Files/JSP/User/viewalgo.jsp");
							rd.forward(request, response); 
			        	 
			        	 
			         }else
			         {
			        	 rd=request.getRequestDispatcher("/Files/JSP/User/viewalgo.jsp?no=1");
							rd.forward(request, response); 
			        	  
			         }
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			     //  -----------------------------------MAPREDUCETHREE- ENDS-----------------------------------------      	  	      
			         }
			           	}
			         	
			         	


			         	
			         	
			         	
			         	
			         	
			         	
			         	
			         	
			         	
			         	
			         	 
			         
						   
						   
					   /* rd=request.getRequestDispatcher("/Files/JSP/User/viewalgo.jsp");
						rd.forward(request, response);
					    
					    }
					   */
			
		}
		catch(Exception e)
		{
			System.out.println("Opps's Error is in User UploadFile Servlet......"+e);
			out.println("Opps's Error is in User UploadFile Servlet......"+e);
		}
	}
	
	
	 public static List<String> ngrams(int n, String str) {
	        List<String> ngrams = new ArrayList<String>();
	        String[] words = str.split("-");
	        for (int i = 0; i < words.length - n + 1; i++)
	            ngrams.add(concat(words, i, i+n));
	        return ngrams;
	    }

	    public static String concat(String[] words, int start, int end) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = start; i < end; i++)
	            sb.append((i > start ? " " : "") + words[i]);
	        return sb.toString();
	    }	
	
	
	
}
