package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*===================================Please Read the ReadMe.txt file===========================================*/
public class DownloadFP extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
			{
		
		
		try
		{
		String filename="";
		String downloadedfilepath=request.getRealPath("") + "/fresetout.txt";
		File file = new File(downloadedfilepath);
		ServletContext context = getServletContext();
		String mimeType = context.getMimeType(downloadedfilepath);
		if (mimeType == null) 
		{
		// set to binary type if MIME mapping not found
		mimeType = "application/octet-stream";
		}
		System.out.println("MIME type: " + mimeType);
														
		// modifies response
		response.setContentType(mimeType);
		response.setContentLength((int) file.length());

		System.out.println("=======lenghthhhhh========="+(int) file.length());
		FileInputStream inStream = new FileInputStream(file);												
		// forces download
		String headerKey = "Content-Disposition";
		String headerValue = String.format("attachment; filename=\"%s\"", file.getName());
		
		response.setHeader(headerKey, headerValue);
		// obtains response's output stream
		OutputStream outStream = response.getOutputStream();
														
		byte[] buffer = new byte[100096];
		int bytesRead1 = -1;
														
		while ((bytesRead1 = inStream.read(buffer)) != -1) 
		{
		outStream.write(buffer, 0, bytesRead1);
		}
		inStream.close();
		outStream.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	    }
	
	
}
	

