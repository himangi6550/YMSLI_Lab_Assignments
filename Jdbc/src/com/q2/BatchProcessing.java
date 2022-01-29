package com.q2;

import java.sql.*;

import com.bookstore.model.persistance.ConnectionFactory;

public class BatchProcessing {
	public static void main(String[] args) {
		Connection connection = ConnectionFactory.getConnection();
		// Using Batch Processing
		System.out.println("Using Batch Processing");
		long startTime = System.currentTimeMillis();
		try {
			connection.setAutoCommit(false);
			PreparedStatement pstmt = connection.prepareStatement("insert into batch(name) values(?)");
			for (long i = 1; i <= 1000; i++) {
				pstmt.setString(1, "Name:" + i);
				pstmt.executeUpdate();
				pstmt.addBatch();// it is adding to batch
				if (i % 200 == 0) {
					pstmt.executeBatch();// it hit the db but unconmmited
				}
			}
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime - startTime));

		// Without Using Batch Processing
		System.out.println("Without Using Batch Processing");

		long start = System.currentTimeMillis();

		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into batch(name) values(?)");
			for (int i = 1; i <= 1000; i++) {
				pstmt.setString(1, "Name:" + i);
				pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("time taken: " + (end - start));
	}

}
