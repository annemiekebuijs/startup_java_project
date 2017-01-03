package nl.spikesoftware.weather_station.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.PreparedStatement;


// only here you can create a new instance of Database, the constructor is private
// this is the singleton pattern

// singleton because you don't want multiple connections to your database
public class Database {
	
	private static Database instance = new Database();
	
	private Connection con;
	
	// CONSTRUCTOR IS PRIVATE
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
		* Add whatever,m methods you like to your singleton class.
		* They have nothing to do with the Singleton pattern
		*/
	public Connection getConnection() {
		return con;
	}
	
	public void connect() throws Exception {
		if (con != null)
			return;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("Driver not found");
        }

        String url;
        url = String.format("jdbc:mysql://localhost:%d/patterns", 3306);
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
