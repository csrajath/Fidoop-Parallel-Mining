
// Program Name	: 	PoolingDAO.java
// Purpose		:	This program is a part of DB table connection
// Author		:	Menaka
// Date			:	1-Jul-2016
// Modified by	:
// Date			:
// Purpose		:



package com.Fidoop.DAOFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;






public class PoolingDAO 
{

	private static PoolingDAO PoolingDAO = null;

	private PoolingDAO() {
	}

	public static PoolingDAO initialize() {
		if (PoolingDAO == null)
		{
			PoolingDAO = new PoolingDAO();
		}
		return PoolingDAO;
	}
	
	
	public static boolean addReviewDetails(String m_invoice,String m_stock,String m_description,String m_customer_id,String m_country)
	{
		boolean flag = false;
		
		String sql = "";
		
		
		try
		{
			
		
			java.sql.PreparedStatement pstmt;
			
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
			
			sql = "insert into m_items_list(m_invoice,m_stock,m_description,m_customer_id,m_country) values('"+m_invoice+"','"+m_stock+"','"+m_description+"','"+m_customer_id+"','"+m_country+"')";

		
			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(sql);
			int i = pstmt.executeUpdate();
		

			if (i > 0)
			{
				flag = true;
			}
		  
		
		
		
			pstmt.close();
			c1.setAutoCommit(true);
		
			dbConnectionPool.freeConnection(c1);
		// release resources
			dbConnectionPool.destroy();


		}
		catch (Exception e)
		{
			System.out.println("Exception in PoolingDAO ==> addReviewDetails() : ");
			e.printStackTrace();
		}
		return flag;

		
	}
	
	
	
//Selecting a distinct values from class
	public static HashMap<Integer, ArrayList<String>> itemslist()
	{
		
		
		
		ResultSet rs=null;
		
		
			
		
			java.sql.PreparedStatement pstmt;
		
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			
		
			//===============================================
			
			HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
			
			try {
				dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
				
				c1 = dbConnectionPool.getConnection();
				pstmt = c1.prepareStatement("select m_stock,m_description from m_items_list");
				rs = pstmt.executeQuery();
				int rowcount=0;
				if (rs.last()) {
					  rowcount = rs.getRow();
					  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
					}
				
				int i=1;
				
				while (rs.next()) 
				{
					if(i<=rowcount)
					{
						//String list1="list"+i;
						ArrayList<String> list =new ArrayList<String>();
						
						
						list.add(rs.getString(1)+"~~"+rs.getString(2));
						
						
						
						map.put(i, list);
						i=i+1;
					}
					
					
				}
				rs.close();
				pstmt.close();
				c1.setAutoCommit(true);
				
				dbConnectionPool.freeConnection(c1);
				// release resources
				dbConnectionPool.destroy();

			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			return map;
			
		
	}
	
	
	public static HashMap<Integer, ArrayList<String>> getInvoiceno()
	{
		
		
		
		ResultSet rs=null;
		
		
			
		
			java.sql.PreparedStatement pstmt;
		
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			
		
			//===============================================
			
			HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
			
			try {
				dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
				
				c1 = dbConnectionPool.getConnection();
				pstmt = c1.prepareStatement("select m_invoice,m_customer_id,m_country from m_items_list;");
				rs = pstmt.executeQuery();
				int rowcount=0;
				if (rs.last()) {
					  rowcount = rs.getRow();
					  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
					}
				
				int i=1;
				
				while (rs.next()) 
				{
					if(i<=rowcount)
					{
						//String list1="list"+i;
						ArrayList<String> list =new ArrayList<String>();
						
						
						list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~"+rs.getString(3));
						
						
						
						map.put(i, list);
						i=i+1;
					}
					
					
				}
				rs.close();
				pstmt.close();
				c1.setAutoCommit(true);
				
				dbConnectionPool.freeConnection(c1);
				// release resources
				dbConnectionPool.destroy();

			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			return map;
			
		
	}
	
	
	
	public static boolean UserloginCHK(String name, String pass)
	{
		
		boolean flag=false;
		
		ResultSet rs=null;
		
		
			
		
			java.sql.PreparedStatement pstmt;
		
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			
		
			//===============================================
			
			HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
			
			try {
				dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
				
				c1 = dbConnectionPool.getConnection();
				pstmt = c1.prepareStatement("select * from m_user where adminid='"+name+"'and adminpass='"+pass+"'");
				rs = pstmt.executeQuery();
				int rowcount=0;
				if (rs.last()) {
					  rowcount = rs.getRow();
					  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
					}
				
				int i=1;
				
				while (rs.next()) 
				{
					if(i<=rowcount)
					{
						flag=true;
					}
					
					
				}
				rs.close();
				pstmt.close();
				c1.setAutoCommit(true);
				
				dbConnectionPool.freeConnection(c1);
				// release resources
				dbConnectionPool.destroy();

			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			return flag;
			
		
	}
	
	
	
	
	public static boolean insertClass(String ref_i_code,String i_name )
	{
		boolean flag = false;
		boolean flag1= false;
		
		ResultSet rs=null;
		String sql = "";
		String sql1 = "";
		
		
		try
		{
			
		
			java.sql.PreparedStatement pstmt;
			
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
			
			sql1 = "select * from  m_items where ref_i_code='"+ref_i_code+"' and i_name='"+i_name+"'";
			
			sql = "insert into m_items(ref_i_code,i_name) values('"+ref_i_code+"','"+i_name+"')";


		
			c1 = dbConnectionPool.getConnection();
			
			pstmt = c1.prepareStatement(sql1);
			rs = pstmt.executeQuery();
			int rowcount=0;
			if (rs.last()) {
				  rowcount = rs.getRow();
				  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
				}
			
			int i=1;
			
			while (rs.next()) 
			{
				if(i<=rowcount)
				{
					flag1=true;
				}
				
				
			}
			rs.close();
			
			if(!flag1)
			{
			
			pstmt = c1.prepareStatement(sql);
			int j = pstmt.executeUpdate();
		

			if (j > 0)
			{
				flag = true;
			}
			}
		
		
		
			pstmt.close();
			c1.setAutoCommit(true);
		
			dbConnectionPool.freeConnection(c1);
		// release resources
			dbConnectionPool.destroy();


		}
		catch (Exception e)
		{
		System.out.println("Exception in PoolingDAO ==> insertClass() : ");
			e.printStackTrace();
		}
		return flag;

	
		
	}

	public static boolean checkinvoice(String billno) 
	{
		ResultSet rs=null;
		boolean flag=false;
		
		
		
		java.sql.PreparedStatement pstmt;
	
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;
		String sql="select * from m_bill where bill_no='"+billno+"'";
	
		//===============================================
		
		HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
		
		try {
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
			
			c1 = dbConnectionPool.getConnection();
			pstmt = c1.prepareStatement(sql);
			rs = pstmt.executeQuery();
			int rowcount=0;
			if (rs.last()) {
				  rowcount = rs.getRow();
				  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
				}
			
			int i=1;
			
			while (rs.next()) 
			{
				if(i<=rowcount)
				{
					flag=true;
				}
				
				
			}
			rs.close();
			pstmt.close();
			c1.setAutoCommit(true);
			
			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return flag;
	}

	public static boolean insert_to_mbill(String billno,String custid,String itemcode,String i_country)
	{
	boolean flag = false;
	
	String sql = "";
		
	try
	{
			
		java.sql.PreparedStatement pstmt;
		
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		sql = "insert into m_bill(bill_no,cust_id,item_codes,i_country) values('"+billno+"','"+custid+"','"+itemcode+"','"+i_country+"')";


	
		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(sql);
		int i = pstmt.executeUpdate();
	

		if (i > 0)
		{
			flag = true;
		}
	  
	
	
	
		pstmt.close();
		c1.setAutoCommit(true);
	
		dbConnectionPool.freeConnection(c1);
	// release resources
		dbConnectionPool.destroy();


	}
	catch (Exception e)
	{
	System.out.println("Exception in PoolingDAO ==> insertClass() : ");
		e.printStackTrace();
	}
	return flag;
	}

	
	public static String getItemcodes(String billno, String custid,String m_country) 
	{
		ResultSet rs=null;
		boolean flag=false;
		StringBuffer sb=new StringBuffer();
		
		
		java.sql.PreparedStatement pstmt;
	
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;
		String sql="select i_code from m_items_list m, m_items n  where m.m_stock=n.ref_i_code and m.m_invoice='"+billno+"' and m.m_customer_id='"+custid+"' and m.m_country='"+m_country+"' order by i_code asc";
	
	
		
		HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
		
		try {
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
			
			c1 = dbConnectionPool.getConnection();
			pstmt = c1.prepareStatement(sql);
			rs = pstmt.executeQuery();
			int rowcount=0;
			if (rs.last())
			{
				  rowcount = rs.getRow();
				  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
				}
			
			int i=1;
			
			while (rs.next()) 
			{
				if(i<=rowcount)
				{
					sb.append(rs.getString(1));
					sb.append("-");
					
				}
				
				
			}
			rs.close();
			pstmt.close();
			c1.setAutoCommit(true);
			
			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return sb.toString();
	}

	
	public static HashMap<Integer, ArrayList<String>> getItemCodes()
	{
		
		ResultSet rs=null;
		
		
			
		
			java.sql.PreparedStatement pstmt;
		
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			
		
			//===============================================
			
			HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
			
			try {
				dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
				
				c1 = dbConnectionPool.getConnection();
				pstmt = c1.prepareStatement("select * from m_bill");
				rs = pstmt.executeQuery();
				int rowcount=0;
				if (rs.last()) {
					  rowcount = rs.getRow();
					  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
					}
				
				int i=1;
				
				while (rs.next()) 
				{
					if(i<=rowcount)
					{
						//String list1="list"+i;
						ArrayList<String> list =new ArrayList<String>();
						
						
						list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~"+rs.getString(3)+"~~"+rs.getString(4));
						
						map.put(i, list);
						i=i+1;
					}
					
					
				}
				rs.close();
				pstmt.close();
				c1.setAutoCommit(true);
				
				dbConnectionPool.freeConnection(c1);
				// release resources
				dbConnectionPool.destroy();

			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			return map;
	}
	
	
	
	
	public static boolean Update_mapreduce(String billno,String custid,String itemcode,String i_country)
	{
	boolean flag = false;
	
	String sql = "";
		
	try
	{
			
		java.sql.PreparedStatement pstmt;
		
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		sql = "insert into m_map_reduce(m_bill_no,cust_id,item_codes,i_country) values('"+billno+"','"+custid+"','"+itemcode+"','"+i_country+"')";


	
		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(sql);
		int i = pstmt.executeUpdate();
	

		if (i > 0)
		{
			flag = true;
		}
	  
	
	
	
		pstmt.close();
		c1.setAutoCommit(true);
	
		dbConnectionPool.freeConnection(c1);
	// release resources
		dbConnectionPool.destroy();


	}
	catch (Exception e)
	{
	System.out.println("Exception in PoolingDAO ==> m_map_reduce() : ");
		e.printStackTrace();
	}
	return flag;
	}

	public static boolean truncatembill() 
	{
		boolean flag = false;
		
		String sql = "";
			
		try
		{
				
			java.sql.PreparedStatement pstmt;
			
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
			
			sql ="TRUNCATE TABLE  m_bill";


		
			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(sql);
			int i = pstmt.executeUpdate();
		

			if (i > 0)
			{
				flag = true;
			}
		  
		
		
		
			pstmt.close();
			c1.setAutoCommit(true);
		
			dbConnectionPool.freeConnection(c1);
		// release resources
			dbConnectionPool.destroy();


		}
		catch (Exception e)
		{
		System.out.println("Exception in PoolingDAO ==> m_map_reduce() : ");
			e.printStackTrace();
		}
		return flag;
	}

	public static boolean insertom_graph_data(String string, int string2,
			double string3, float tottime) 
	{
		boolean flag = false;
		
		String sql = "";
			
		try
		{
				
			java.sql.PreparedStatement pstmt;
			
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
			
			sql = "insert into m_graph_data(m_algorithm,no_of_records,support,time) values('"+string+"','"+string2+"','"+string3+"','"+tottime+"')";


		
			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(sql);
			int i = pstmt.executeUpdate();
		

			if (i > 0)
			{
				flag = true;
			}
		  
		
		
		
			pstmt.close();
			c1.setAutoCommit(true);
		
			dbConnectionPool.freeConnection(c1);
		// release resources
			dbConnectionPool.destroy();


		}
		catch (Exception e)
		{
		System.out.println("Exception in PoolingDAO ==> m_map_reduce() : ");
			e.printStackTrace();
		}
		return flag;
	}
	
	
	public static HashMap<Integer, ArrayList<String>> getgraphdata()
	{
		
		ResultSet rs=null;
		
		
			
		
			java.sql.PreparedStatement pstmt;
		
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			
		
			//===============================================
			
			HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
			
			try {
				dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
				
				c1 = dbConnectionPool.getConnection();
				pstmt = c1.prepareStatement("select * from m_graph_data");
				rs = pstmt.executeQuery();
				int rowcount=0;
				if (rs.last()) {
					  rowcount = rs.getRow();
					  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
					}
				
				int i=1;
				
				while (rs.next()) 
				{
					if(i<=rowcount)
					{
						//String list1="list"+i;
						ArrayList<String> list =new ArrayList<String>();
						
						
						list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~"+rs.getString(3)+"~~"+rs.getString(4)+"~~"+rs.getString(5));
						
						map.put(i, list);
						i=i+1;
					}
					
					
				}
				rs.close();
				pstmt.close();
				c1.setAutoCommit(true);
				
				dbConnectionPool.freeConnection(c1);
				// release resources
				dbConnectionPool.destroy();

			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			return map;
	}

	public static boolean updatepass(String name, String cpass, String npass) {
boolean flag = false;
		
		String sql = "";
			
		try
		{
				
			java.sql.PreparedStatement pstmt;
			
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
			
			sql = "update m_user set adminpass='"+npass+"' where adminpass='"+cpass+"' and adminid='"+name+"' ";


		
			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(sql);
			int i = pstmt.executeUpdate();
		

			if (i > 0)
			{
				flag = true;
			}
		  
		
		
		
			pstmt.close();
			c1.setAutoCommit(true);
		
			dbConnectionPool.freeConnection(c1);
		// release resources
			dbConnectionPool.destroy();


		}
		catch (Exception e)
		{
		System.out.println("Exception in PoolingDAO ==> m_map_reduce() : ");
			e.printStackTrace();
		}
		return flag;
	}

	public static boolean truncatetables() {
		String sql1 = "";
		String sql2 = "";
		String sql3 = "";
		String sql4 = "";
		String sql5 = "";
		
		String sql6 = "";
		String sql7 = "";
		String sql8 = "";
		String sql9 = "";
		String sql10 = "";
		boolean flag=false;
		try
		{
				
			java.sql.PreparedStatement pstmt;
			
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
			
			sql1 = "truncate table m_bill";
			sql2 = "truncate table m_graph_data";
			sql3 = "truncate table m_items";
			sql4 ="truncate table m_items_list";
		    sql5 ="truncate table m_map_reduce";
		    
		    sql6 ="truncate table m_billfiut";
		    sql7 ="truncate table m_fiut_finalset";
		    sql8 ="truncate table m_map_reduce_three";
		    sql9 ="truncate table m_map_reduce_two";
		    sql10 ="truncate table m_temp";
		    
		    
		


		
			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(sql1);
			int i = pstmt.executeUpdate();
			
			pstmt = c1.prepareStatement(sql2);
			 i = pstmt.executeUpdate();
			
			pstmt = c1.prepareStatement(sql3);
			 i = pstmt.executeUpdate();
			
			pstmt = c1.prepareStatement(sql4);
			 i = pstmt.executeUpdate();
			
			pstmt = c1.prepareStatement(sql5);
			 i = pstmt.executeUpdate();
			 
			 pstmt = c1.prepareStatement(sql6);
			 i = pstmt.executeUpdate();
			 
			 pstmt = c1.prepareStatement(sql7);
			 i = pstmt.executeUpdate();
			 
			 pstmt = c1.prepareStatement(sql8);
			 i = pstmt.executeUpdate();
			 
			 
			 pstmt = c1.prepareStatement(sql9);
			 i = pstmt.executeUpdate();
			 
			 
			 pstmt = c1.prepareStatement(sql10);
			 i = pstmt.executeUpdate();
			 
		

			if (i > 0)
			{
				flag = true;
			}
		  
		
		
		
			pstmt.close();
			c1.setAutoCommit(true);
		
			dbConnectionPool.freeConnection(c1);
		// release resources
			dbConnectionPool.destroy();


		}
		catch (Exception e)
		{
		System.out.println("Exception in PoolingDAO ==> m_map_reduce() : ");
			e.printStackTrace();
		}
		return flag;
	}

	
	///==================================================================
	
	public static HashMap<Integer, ArrayList<String>> getfirstmapreducethings()
	{
		
		ResultSet rs=null;
		
		
			
		
			java.sql.PreparedStatement pstmt;
		
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			
		
			//===============================================
			
			HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
			
			try {
				dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
				
				c1 = dbConnectionPool.getConnection();
				pstmt = c1.prepareStatement("select item_codes from m_map_reduce");
				
				String sql="select item_codes from m_map_reduce";
				
				System.out.println("query is >>>>>>>>>>"+sql);
				rs = pstmt.executeQuery();
				int rowcount=0;
				if (rs.last()) {
					  rowcount = rs.getRow();
					  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
					}
				
				int i=1;
				
				while (rs.next()) 
				{
					if(i<=rowcount)
					{
						//String list1="list"+i;
						ArrayList<String> list =new ArrayList<String>();
						
						
						list.add(rs.getString(1)+"~~");
						
						map.put(i, list);
						i=i+1;
					}
					
					
				}
				rs.close();
				pstmt.close();
				c1.setAutoCommit(true);
				
				dbConnectionPool.freeConnection(c1);
				// release resources
				dbConnectionPool.destroy();

			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			return map;
	}
	
	
	public static boolean mapreducetwo(String itemset,String count)
	{
		boolean flag = false;
		
		String sql = "";
		
		
		try
		{
			
		
			java.sql.PreparedStatement pstmt;
			
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
			
			sql = "insert into m_map_reduce_two(itemset,count) values('"+itemset+"','"+count+"')";

		
			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(sql);
			int i = pstmt.executeUpdate();
		

			if (i > 0)
			{
				flag = true;
			}
		  
		
		
		
			pstmt.close();
			c1.setAutoCommit(true);
		
			dbConnectionPool.freeConnection(c1);
		// release resources
			dbConnectionPool.destroy();


		}
		catch (Exception e)
		{
			System.out.println("Exception in PoolingDAO ==> addReviewDetails() : ");
			e.printStackTrace();
		}
		return flag;

		
	}
	
	public static boolean truncatembillfiut() 
	{
		boolean flag = false;
		
		String sql = "";
			
		try
		{
				
			java.sql.PreparedStatement pstmt;
			
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
			
			sql ="TRUNCATE TABLE  m_billfiut";


		
			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(sql);
			int i = pstmt.executeUpdate();
		

			if (i > 0)
			{
				flag = true;
			}
		  
		
		
		
			pstmt.close();
			c1.setAutoCommit(true);
		
			dbConnectionPool.freeConnection(c1);
		// release resources
			dbConnectionPool.destroy();


		}
		catch (Exception e)
		{
		System.out.println("Exception in PoolingDAO ==> m_map_reduce() : ");
			e.printStackTrace();
		}
		return flag;
	}
	
	public static boolean insert_to_mbillfiut(String billno,String custid,String itemcode,String i_country)
	{
	boolean flag = false;
	
	String sql = "";
		
	try
	{
			
		java.sql.PreparedStatement pstmt;
		
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		sql = "insert into m_billfiut(bill_no,cust_id,item_codes,i_country) values('"+billno+"','"+custid+"','"+itemcode+"','"+i_country+"')";


	
		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(sql);
		int i = pstmt.executeUpdate();
	

		if (i > 0)
		{
			flag = true;
		}
	  
	
	
	
		pstmt.close();
		c1.setAutoCommit(true);
	
		dbConnectionPool.freeConnection(c1);
	// release resources
		dbConnectionPool.destroy();


	}
	catch (Exception e)
	{
	System.out.println("Exception in PoolingDAO ==> insertClass() : ");
		e.printStackTrace();
	}
	return flag;
	}
	
	public static HashMap<Integer, ArrayList<String>> getsecondmapreducethings()
	{
		
		ResultSet rs=null;
		
		
			
		
			java.sql.PreparedStatement pstmt;
		
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			
		
			//===============================================
			
			HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
			
			try {
				dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
				
				c1 = dbConnectionPool.getConnection();
				pstmt = c1.prepareStatement("select itemset from m_map_reduce_two");
				
				String sql="select itemset from m_map_reduce_two";
				
				System.out.println("query is >>>>>>>>>>"+sql);
				rs = pstmt.executeQuery();
				int rowcount=0;
				if (rs.last()) {
					  rowcount = rs.getRow();
					  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
					}
				
				int i=1;
				
				while (rs.next()) 
				{
					if(i<=rowcount)
					{
						//String list1="list"+i;
						ArrayList<String> list =new ArrayList<String>();
						
						
						list.add(rs.getString(1)+"~~");
						
						map.put(i, list);
						i=i+1;
					}
					
					
				}
				rs.close();
				pstmt.close();
				c1.setAutoCommit(true);
				
				dbConnectionPool.freeConnection(c1);
				// release resources
				dbConnectionPool.destroy();

			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			return map;
	}

	
	public static HashMap<Integer, ArrayList<String>> getsecondmapreducecount(String coun)
	{
		
		ResultSet rs=null;
		
		
			
		
			java.sql.PreparedStatement pstmt;
		
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			
		
			//===============================================
			
			HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
			
			try {
				dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
				
				c1 = dbConnectionPool.getConnection();
				pstmt = c1.prepareStatement("select count from m_map_reduce_two where itemset='"+coun+"'");
				
				String sql="select itemset,count from m_map_reduce_two";
				
				System.out.println("query is >>>>>>>>>>"+sql);
				rs = pstmt.executeQuery();
				int rowcount=0;
				if (rs.last()) {
					  rowcount = rs.getRow();
					  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
					}
				
				int i=1;
				
				while (rs.next()) 
				{
					if(i<=rowcount)
					{
						//String list1="list"+i;
						ArrayList<String> list =new ArrayList<String>();
						
						
						list.add(rs.getString(1)+"~~");
						
						map.put(i, list);
						i=i+1;
					}
					
					
				}
				rs.close();
				pstmt.close();
				c1.setAutoCommit(true);
				
				dbConnectionPool.freeConnection(c1);
				// release resources
				dbConnectionPool.destroy();

			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			return map;
	}
	
	public static boolean insert_to_decomposition(String itemcount,String coun)
	{
	boolean flag = false;
	
	String sql = "";
		
	try
	{
			
		java.sql.PreparedStatement pstmt;
		
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		sql = "insert into m_temp(itemset_decomposition,coun) values('"+itemcount+"','"+coun+"')";


	
		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(sql);
		int i = pstmt.executeUpdate();
	

		if (i > 0)
		{
			flag = true;
		}
	  
	
	
	
		pstmt.close();
		c1.setAutoCommit(true);
	
		dbConnectionPool.freeConnection(c1);
	// release resources
		dbConnectionPool.destroy();


	}
	catch (Exception e)
	{
	System.out.println("Exception in PoolingDAO ==> insertClass() : ");
		e.printStackTrace();
	}
	return flag;
	}
	
	public static HashMap<Integer, ArrayList<String>> getfinalitemsets()
	{
		
		ResultSet rs=null;
		
		
			
		
			java.sql.PreparedStatement pstmt;
		
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			
		
			//===============================================
			
			HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
			
			try {
				dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
				
				c1 = dbConnectionPool.getConnection();
				pstmt = c1.prepareStatement("select itemset_decomposition, sum(coun)from m_temp  group by itemset_decomposition");
				rs = pstmt.executeQuery();
				int rowcount=0;
				if (rs.last()) {
					  rowcount = rs.getRow();
					  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
					}
				
				int i=1;
				
				while (rs.next()) 
				{
					if(i<=rowcount)
					{
						//String list1="list"+i;
						ArrayList<String> list =new ArrayList<String>();
						
						
						list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~");
						System.out.println("final project display is ***************************"+list);
						map.put(i, list);
						i=i+1;
					}
					
					
				}
				rs.close();
				pstmt.close();
				c1.setAutoCommit(true);
				
				dbConnectionPool.freeConnection(c1);
				// release resources
				dbConnectionPool.destroy();

			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			return map;
	}
	
	public static boolean insert_to_mapreducethree(String itemcount,String coun)
	{
	boolean flag = false;
	
	String sql = "";
		
	try
	{
			
		java.sql.PreparedStatement pstmt;
		
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		sql = "insert into m_map_reduce_three(final_fiutset,coun) values('"+itemcount+"','"+Integer.parseInt(coun)+"')";

System.out.println("sql @@@@@@@@@"+sql);
	
		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(sql);
		int i = pstmt.executeUpdate();
	

		if (i > 0)
		{
			flag = true;
		}
	  
	
	
	
		pstmt.close();
		c1.setAutoCommit(true);
	
		dbConnectionPool.freeConnection(c1);
	// release resources
		dbConnectionPool.destroy();


	}
	catch (Exception e)
	{
	System.out.println("Exception in PoolingDAO ==> insertClass() : ");
		e.printStackTrace();
	}
	return flag;
	}
	
	public static HashMap<Integer, ArrayList<String>> getreducedfinalitemset()
	{
		
		ResultSet rs=null;
		
		
			
		
			java.sql.PreparedStatement pstmt;
		
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			
		
			//===============================================
			
			HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
			
			try {
				dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
				
				c1 = dbConnectionPool.getConnection();
				pstmt = c1.prepareStatement("select final_fiutset,coun from m_map_reduce_three");
				rs = pstmt.executeQuery();
				int rowcount=0;
				if (rs.last()) {
					  rowcount = rs.getRow();
					  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
					}
				
				int i=1;
				
				while (rs.next()) 
				{
					if(i<=rowcount)
					{
						//String list1="list"+i;
						ArrayList<String> list =new ArrayList<String>();
						
						
						list.add(rs.getString(1)+"~~"+rs.getInt(2)+"~~");
						System.out.println("final project display is ***************************"+list);
						map.put(i, list);
						i=i+1;
					}
					
					
				}
				rs.close();
				pstmt.close();
				c1.setAutoCommit(true);
				
				dbConnectionPool.freeConnection(c1);
				// release resources
				dbConnectionPool.destroy();

			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			return map;
	}
	
	public static HashMap<Integer, ArrayList<String>> chechfinalsupport(int supp)
	{
		
		ResultSet rs=null;
		
		
			
		
			java.sql.PreparedStatement pstmt;
		
			Connection c1;
			DataBaseConnectionPool dbConnectionPool;
			
		
			//===============================================
			
			HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
			
			try {
				dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
				
				c1 = dbConnectionPool.getConnection();
				pstmt = c1.prepareStatement("select * from m_map_reduce_three where coun>='"+supp+"'");
				
				String sql="select * from m_map_reduce_three where coun>='"+supp+"'";
				
				System.out.println("final query is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+sql);
				rs = pstmt.executeQuery();
				int rowcount=0;
				if (rs.last()) {
					  rowcount = rs.getRow();
					  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
					}
				
				int i=1;
				
				while (rs.next()) 
				{
					if(i<=rowcount)
					{
						//String list1="list"+i;
						ArrayList<String> list =new ArrayList<String>();
						
						
						list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~"+rs.getInt(3)+"~~");
						
						map.put(i, list);
						i=i+1;
					}
					
					
				}
				rs.close();
				pstmt.close();
				c1.setAutoCommit(true);
				
				dbConnectionPool.freeConnection(c1);
				// release resources
				dbConnectionPool.destroy();

			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			return map;
	}
	
	public static boolean insert_to_fiutfinal(String id,String itemset,String con)
	{
	boolean flag = false;
	
	String sql = "";
		
	try
	{
			
		java.sql.PreparedStatement pstmt;
		
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		sql = "insert into m_fiut_finalset(f_id,final_fiutset,cnt) values('"+id+"','"+itemset+"','"+Integer.parseInt(con)+"')";

System.out.println("sql @@@@@@@@@"+sql);
	
		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(sql);
		int i = pstmt.executeUpdate();
	

		if (i > 0)
		{
			flag = true;
		}
	  
	
	
	
		pstmt.close();
		c1.setAutoCommit(true);
	
		dbConnectionPool.freeConnection(c1);
	// release resources
		dbConnectionPool.destroy();


	}
	catch (Exception e)
	{
	System.out.println("Exception in PoolingDAO ==> insertClass() : ");
		e.printStackTrace();
	}
	return flag;
	}


	
}