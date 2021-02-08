/* -- author W.M.S.T Wijekoon
	IT19210452
	kandy weekday
	G1_G8_vehicle rental system -- */


package com.SpeedTaxi.Util;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {

	private static String url = "jdbc:mysql://localhost:3306/speedtaxi";
	private static String userName = "root";
	private static String password = "";
	private static Connection con;

	// create DB connection
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, userName, password);
			
		}
		catch (Exception e) {
			System.out.println("Database connection is not success!!!");
		}
		
		return con;
	}
}
