package com.iu.s1.test;

import java.sql.Connection;

import com.iu.s1.bankbook.BankBookDAO;
import com.iu.s1.bankbook.BankBookDTO;
import com.iu.s1.util.DBConnector;

public class DBTest {

	public static void main(String[] args) {
		//Test
//		DBConnector dbConnector = new DBConnector();
//		Connection con = dbConnector.getConnect();
//		System.out.println(con);
		
		//BankBookDAO getSelect Test
		BankBookDAO bankBookDAO = new BankBookDAO();
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(1);
		bankBookDTO = bankBookDAO.getSelect(bankBookDTO);
		
		System.out.println(bankBookDTO.getBookName());

	}

}
