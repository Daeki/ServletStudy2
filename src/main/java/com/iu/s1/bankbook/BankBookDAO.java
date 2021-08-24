package com.iu.s1.bankbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iu.s1.util.DBConnector;

public class BankBookDAO {
	
	private DBConnector dbConnector;
	
	public BankBookDAO() {
		dbConnector = new DBConnector();
	}
	
	//getList
	public ArrayList<BankBookDTO> getList() {
		Connection con = dbConnector.getConnect();
		PreparedStatement st = null;
		ResultSet rs = null;
		ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();
		
		String sql= "select * from bankbook";
		
		try {
			st = con.prepareStatement(sql);
			
			rs = st.executeQuery();
			
			while(rs.next()) {
				BankBookDTO bankBookDTO = new BankBookDTO();
				bankBookDTO.setBookNumber(rs.getLong("bookNumber"));
				bankBookDTO.setBookName(rs.getString("bookName"));
				bankBookDTO.setBookRate(rs.getDouble("bookRate"));
				bankBookDTO.setBookSale(rs.getInt("bookSale"));
				ar.add(bankBookDTO);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnector.disConnect(rs, st, con);
		}
		
		return ar;
		
	}
	
	public BankBookDTO getSelect(BankBookDTO bankBookDTO) {
		
		Connection con = dbConnector.getConnect();
		System.out.println("Con : "+con);
		PreparedStatement st=null;
		ResultSet rs = null;
		BankBookDTO result=null;
		String sql ="SELECT * FROM BANKBOOK WHERE BOOKNUMBER=?";
		
		try {
			st = con.prepareStatement(sql);
			
			st.setLong(1, bankBookDTO.getBookNumber());
			
			rs = st.executeQuery();
			
			if(rs.next()) {
				result = new BankBookDTO();
				result.setBookNumber(rs.getLong("bookNumber"));
				result.setBookName(rs.getString("bookName"));
				result.setBookRate(rs.getDouble("bookRate"));
				result.setBookSale(rs.getInt("bookSale"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbConnector.disConnect(rs, st, con);
		}
		
		return result;
		
	}
	

}
