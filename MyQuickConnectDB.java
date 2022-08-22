package com.deneme.app;

import java.sql.Connection;
import java.sql.DriverManager;


public class MyQuickConnectDB {
	
	private static Connection connection= null;
	
	public static Connection getConnectDB(String jdbcDriver,String url,String username,String password) {
		
		try {
			Class.forName(jdbcDriver);
			connection = (Connection)DriverManager.getConnection(url,username,password);
			System.out.println("Database bağlantısı başarılı.");
		} catch (Exception e) {
		    System.out.println("Database bağlantısı yapılırken hata: " + e.getMessage());
		}
		
		return connection;
	}
	
		
	
	public static void closeConnectDB(Connection connection) {
		
		try {
			connection.close();
			System.out.println("Database bağlantısı başarıyla kapatıldı.");

		} catch (Exception e) {
			System.out.println("Database bağlantısı kapatılırken hata: " + e.getMessage());	
		}
		
	}

}
