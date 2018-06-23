package com.util;

import org.jfree.chart.ChartFactory;
 import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;

import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;


import com.Fidoop.DAOFactory.DataBaseConnectionPool;
import com.Fidoop.DAOFactory.Global;


import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
 
 public class WriteGraphtoImage
  {
	
	 public  void Writeimage(String path) throws IOException, SQLException
     {    
		 Connection dbConnection = null;
    	 DataBaseConnectionPool dbConnectionPool;
	        dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);
    	 dbConnection = dbConnectionPool.getConnection();
    	
    	JDBCCategoryDataset dataset = new JDBCCategoryDataset(dbConnection);
    	
    	
    	
    	
    	dataset.executeQuery("select norecords,FP_Tree,FIUT_Tree from m_graph order by slno");
    	
    	System.out.println("???????????????????select s_name, memory from m_load_status_1 order by memory ");
    
    	JFreeChart chart = ChartFactory.createBarChart("FIUT  vs FP-Tree Support 20%", "No of Records", "Time taken",dataset, PlotOrientation.VERTICAL, true, true, true);           
           chart.setBorderVisible(true);
    
	    if (chart != null) 
	    {
	            int width = 600;
	            int height = 400;
           
	             
	            try 
	            {
	            	 
	            	WriteGraphtoImage.saveChartAsPNG(chart,path);
	          
	            } 
	            catch (IOException ex)
	            {
	                System.err.println(ex);
	            }
	        
	    }
	
     }
 

    public static void saveChartAsPNG(JFreeChart chart,String path) throws IOException
	      {    
    	
    	System.out.println("=================================JJJJJJJJJJJJJJJJJJJJ");
    	File file = new File(path+"/"+"Barchart3d.png");
        ChartUtilities.saveChartAsPNG(file, chart, 800, 600);
    }
    public static void saveLineChartAsPNG(JFreeChart chart,String path) throws IOException
    {    
	
	System.out.println("=================================JJJJJJJJJJJJJJJJJJJJ");
	File file = new File(path+"/"+"Linechart3d.png");
  ChartUtilities.saveChartAsPNG(file, chart, 800, 600);
}

    public static void main(String[] args) throws SQLException, IOException
	      {
    	
    	
    	WriteGraphtoImage obj=new WriteGraphtoImage();
    	
    	obj.Writeimage("D:/");
    
    }
}