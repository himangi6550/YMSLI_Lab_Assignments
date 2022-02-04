package com.java8.Q2.model.persistence;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	private static Connection connection;
	public static Connection getConnection() {
		Properties properties = new Properties();
		InputStream inStream;
		String url,driver,username,password;
		try {
			inStream = new FileInputStream("db.properties");
			properties.load(inStream);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		url = properties.getProperty("jdbc.url");
		driver = properties.getProperty("jdbc.driver");
		username = properties.getProperty("jdbc.username");
		password = properties.getProperty("jdbc.password");
		try {
			Class.forName(driver);
			System.out.println("Driver loaded");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		 //creating connection object
		try {
			connection = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection succesfull");
		return connection;
	}

}
