package com.FPgrowth;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;



public class FPgrowth {
	
	
	 
		
	
	public static void main(String[] args) {
		
try
{
		long startTimestamp;
		long endTimestamp;
		
			 
	   
		
		
		startTimestamp = System.currentTimeMillis();
	
	
	
	System.out.println(">>>>>>>>>>current time of system before execution in Fprowth is>>>>>>>>>>"+startTimestamp);
		
	double minsup=0.1;
	
	
	 
	  
 
	 
	  
	String inputFile="D:\\freset.txt";
	 
		String outputFile="D:\\fresetout.txt";
		
		AlgoFPGrowth algo = new AlgoFPGrowth();
		algo.runAlgorithm(inputFile, outputFile, minsup);
		
		 endTimestamp = System.currentTimeMillis();
       algo.printStats();
	 
	
	
	 
       
       
}catch (Exception e) {
	// TODO: handle exception
}
		
		

}
}