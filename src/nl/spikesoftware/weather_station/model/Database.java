package nl.spikesoftware.weather_station.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database {
	
	private static Database instance = new Database();
	
	private Connection con;
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		return instance;
	}
	
	/*
	private static Database instanceOld;
	
	public static Database getInstanceOld() {
		if(instanceOld == null) {
			instanceOld = new Database();
		}
		
		return instanceOld;
	}
	*/
	
	/*
	 * Add whatever methods you like to your singleton class.
	 */
	
	public Connection getConnection() {
		return con;
	}
	
	public void connect() throws Exception {
		if (con != null)
			return;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			throw new Exception("Driver not found");
		}

		String url = String.format("jdbc:mysql://localhost:%d/patterns", 3306);

		con = DriverManager.getConnection(url, "truuslee", "");
	}
	
	public void disconnect() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Can't close connection");
			}
		}
		
		con = null;
	}
	
}
