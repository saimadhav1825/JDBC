package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddingData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        // PreparedStatement st=con.prepareStatement("insert into Alien values(?,?)");
	            PreparedStatement st=con.prepareStatement("update Alien set aname=? where aid=?");
	           
		
		        
		          st.setString(1, "kiran");
		          st.setInt(2, 50);
		          
		          st.executeQuery();
		         // st.executeUpdate();
		           
		
		

	}

}
