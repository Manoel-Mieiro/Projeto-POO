package dex.dao;
/*
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;


public class MySqlConnection {

	private static final String USERNAME = "root";

	private static final String PASSWORD = "1234"; 

	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/dex";

	public static Connection getConnection() throws Exception{
		Class.forName ("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection (DATABASE_URL, USERNAME, PASSWORD);
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		Connection conn = getConnection();
		if (conn!=null) {
			System.out.println("Conexão obtida com sucesso!");
			conn.close();
		}
		
	}
}


public class MySqlConnection {

	public Connection getConnection() {
		java.sql.Connection conn = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/dex";
		String user = "root";
		String password = "1234";
				try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		}catch (Exception e) {
			return null;
			} 
	}
}
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

    private Connection conn;
    
    public Connection getConnection() throws Exception{

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("No database");
        }

        String connectionURL = "jdbc:mysql://localhost:3306/DEX?autoReconnect=true&useSSL=false";

        conn = DriverManager.getConnection(connectionURL, "root", "1234");
        return conn;
    }

    public void close(){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}