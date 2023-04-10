package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class class1 {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://NHSSQLCHNE6986.cscidp.net;instanceName=LZOANZ002;trustServerCertificate=true;databaseName=Lorenzo;";
		String user ="rcdev";
		String password = "rcdev";
		
	    ResultSet resultSet = null;

	    try (Connection connection = DriverManager.getConnection(url, user, password);
	            Statement statement = connection.createStatement();) {

	        String selectSql = "SELECT surname FROM Patient WHERE PASID='PASID-015170'";
	        resultSet = statement.executeQuery(selectSql);

	        while (resultSet.next()) {
	            System.out.println(resultSet.getString("surname"));
	        }
	    }
	    catch (SQLException e) {
	        e.printStackTrace();
	    }
}
}
