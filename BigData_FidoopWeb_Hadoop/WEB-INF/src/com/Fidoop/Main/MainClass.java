package com.Fidoop.Main;


import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import com.Fidoop.util.*;

public class MainClass 
{
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	
	{
		boolean flag =Excel_upload.ExcelUpload();
		System.out.println("<<<<<<<<---------<Excel_upload>------------>>>>>>>>>>"+flag);
		
		
		//flag=GetInvoiceRead.Itemlistread();
		System.out.println("<<<<<<<<---------<tclaim>------------>>>>>>>>>>"+flag);
		
		 ArrayList<String> list=new ArrayList<String>();
		
		 list=Items_Mapreduce.ItemCodescount();
		 System.out.println("--------the list2"+list);
		 
		 
		 flag=Items_Mapreduce.itemsetmapreduce(list);
		
		
		 try
		{
		 String filePath = "config.properties";

			filePath = "config.properties";
			System.out.println("filepath upload is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+filePath);
			FileInputStream fileInputStream = new FileInputStream(new File(
					filePath));
			Properties properties = new Properties();
			properties.load(fileInputStream);

			Configuration conf = new Configuration();
			conf.addResource(new Path(properties.getProperty("hadoopLoc")));
			FileSystem fs = FileSystem.get(conf);
			Path pt = new Path(properties.getProperty("hdfsLoc"));

			Path src = new Path("test.txt");
			
			//==========================================================
			
			
			
			//===========================================================
			
			
			
			
			fs.copyFromLocalFile(src, pt);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}
	
	

}
