package com.db;

import java.sql.*;

public class DBHelper {	
	private String dbUrl="jdbc:mysql://localhost:3306/sushe?characterEncoding=utf8";
	private String dbUser="root";
	private String dbPassword="";
	private String jdbcName="com.mysql.jdbc.Driver";
	

	public Connection getConn(){
		Connection conn = null;
		try{
			Class.forName(jdbcName);
		}
		catch(Exception e){}
		try{
			conn=DriverManager.getConnection(dbUrl,dbUser,dbPassword);
		}
		catch(SQLException ex){}
		return conn;		
	}
	

	public static void main(String[] args)
	{
		System.out.println(new DBHelper().getConn());
		
	}
	
}
