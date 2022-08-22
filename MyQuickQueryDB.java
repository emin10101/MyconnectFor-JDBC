package com.deneme.app;

import java.sql.Connection;
import java.sql.Statement;

public class MyQuickQueryDB {

	private static Statement statement;

	public static void randomQuery(Connection connection, String sorgu) {

		try {
			statement = connection.createStatement();
		} catch (Exception e) {
			System.out.println("Statement oluşturuluırken hata:" + e.getMessage());
		}

		try {
			statement.execute(sorgu);
		} catch (Exception e) {
			System.out.println("Sorgu esnasında Hata:" + e.getMessage());
		}

	}

}
