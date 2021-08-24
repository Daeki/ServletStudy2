package com.iu.s1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnector {
	
	public Connection getConnect() {
		String user="user02";
		String password="user02";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		Connection con=null;
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Connection Error");
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	public void disConnect(ResultSet rs, PreparedStatement st, Connection con) {
		try {
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
