package com.sainsburys.sms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection con = null;

	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1523:orcl5";
		String uname = "scott";
		String pwd = "scott";
		try {
			con = DriverManager.getConnection(url, uname, pwd);
			System.out.println("Connected");
		} catch (SQLException e) {
			System.out.println("Unable to connect to database due to below issues:");
			e.printStackTrace();
		}
		return con;

	}
}
