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



public class Login extends HttpServlet 
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out = response.getWriter();
		HttpSession session =request.getSession();
		try
		{
			String name=request.getParameter("name");
			String pass=request.getParameter("pass");
			
			boolean result=PoolingDAO.UserloginCHK(name, pass);
			if(result)
			{
				request.setAttribute("user", name);
				session.setAttribute("userid", name);
			
				RequestDispatcher rd=request.getRequestDispatcher("/Files/JSP/User/home.jsp");
				rd.forward(request, response);
			}
			else
			{
				response.sendRedirect(request.getContextPath()+"?no=1");
			}
		}
		catch(Exception e)
		{
			System.out.println("Opps's Error is in UserLogin Servlet......"+e);
			out.println("Opps's Error is in UserLogin Servlet......"+e);
		}
	}
}
