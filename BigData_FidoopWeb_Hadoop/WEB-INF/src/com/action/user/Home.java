/**
 * 
 */
package com.action.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.Fidoop.DAOFactory.PoolingDAO;



public class Home extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		
		try
		{
			
			
			
				RequestDispatcher rd=request.getRequestDispatcher("/Files/JSP/User/home.jsp");
				rd.forward(request, response);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
