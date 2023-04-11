import java.sql.*;


module Javawithsql {
		 
	    public  void main (String[] args) {
	        try {
	            String url = "jdbc:msql://172.25.89.86/LZOANZ002";
	            Connection conn = DriverManager.getConnection(url,"rcdev","rcdev");
	            Statement stmt = conn.createStatement();
	            ResultSet rs;
	 
	            rs = stmt.executeQuery("SELECT surname FROM Patient WHERE PASID='PASID-015170'");
	            while ( rs.next() ) {
	                String Name = rs.getString("surname");
	                System.out.println(Name);
	            }
	            conn.close();
	        } catch (Exception e) {
	            System.err.println("Got an exception! ");
	            System.err.println(e.getMessage());
	        }
	    }
}