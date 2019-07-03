package com.pld.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SampleDbConnector {
	
	public static void main(String[] args) throws Exception
	{
		String dburl = "jdbc:db2://bldbz173032.cloud.dst.ibm.com (9.16.173.32):60006/PLDBDEV";
		String username = "shbudipa@in.ibm.com";
		String Password = "WelcomeF0rOE2";
		Class.forName("com.ibm.db2.jdbc.Driver");
		Connection con = DriverManager.getConnection(dburl, username, Password);
		String query = "select*from pldb.fin_utilzn_summary;";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
	}

}
