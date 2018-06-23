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
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import com.FPgrowth.AlgoFPGrowth;
import com.FPgrowth.Test;
import com.Fidoop.DAOFactory.PoolingDAO;

import com.util.Utility;



public class ChangePass extends HttpServlet 
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		HttpSession session=request.getSession();
		PrintWriter out = response.getWriter();
		try
		{
			String submit=request.getParameter("submit");
			//String name=request.getParameter("name");
			System.out.println("submit---"+submit);
			//System.out.println("name----"+name);
			boolean result=false;
		
			RequestDispatcher rd=null;
			 if(submit.equals("get"))
			{
				  
				rd=request.getRequestDispatcher("/Files/JSP/User/changepass.jsp");
				rd.forward(request, response);
			}
			 if(submit.equals("update"))
				{
				 String name=session.getAttribute("userid").toString();
				 
				 String cpass=request.getParameter("cpass");
				 String npass=request.getParameter("npass");
				 
				 boolean flag=false;
				 flag=PoolingDAO.updatepass(name,cpass,npass);
				 if(flag)
				 {
					 rd=request.getRequestDispatcher("/Files/JSP/User/changepass.jsp?no=1");
						rd.forward(request, response); 
				 }
				 else
				 {
					 rd=request.getRequestDispatcher("/Files/JSP/User/changepass.jsp?no=2");
						rd.forward(request, response);
				 }
				 
					
					
				}
			 if(submit.equals("truncate"))
				{
				 String name=session.getAttribute("userid").toString();
				 
				
				 
				 boolean flag=false;
				 flag=PoolingDAO.truncatetables();
				 if(flag)
				 {
					 rd=request.getRequestDispatcher("/Files/JSP/User/home.jsp?no=1");
						rd.forward(request, response); 
				 }
				 else
				 {
					 rd=request.getRequestDispatcher("/Files/JSP/User/home.jsp?no=2");
						rd.forward(request, response);
				 }
				 
					
					
				}
			 
			 
			 
			
		}
		catch(Exception e)
		{
			System.out.println("Opps's Error is in User UploadFile Servlet......"+e);
			out.println("Opps's Error is in User UploadFile Servlet......"+e);
		}
	}
}
