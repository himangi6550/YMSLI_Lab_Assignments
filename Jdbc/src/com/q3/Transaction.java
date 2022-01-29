package com.q3;

import java.sql.*;


import com.bookstore.model.persistance.ConnectionFactory;

public class Transaction {
	public static void main(String[] args) {
		Connection connection = ConnectionFactory.getConnection();
		try {
			connection.setAutoCommit(false);
			connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
			PreparedStatement pstmt = connection.
					prepareStatement("update account set balance=balance-10 where id=?");
			pstmt.setInt(1, 1);
			pstmt.executeUpdate();

			pstmt = connection.prepareStatement("update account set balance=balance+10 where id=?");
			pstmt.setInt(1, 2);
			pstmt.executeUpdate();

			connection.commit();
			System.out.println("transfer is done");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}

}
