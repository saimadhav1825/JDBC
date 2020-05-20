package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchingData {
public  static void main(String[] args) throws ClassNotFoundException, SQLException
{

	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	             Statement st=con.createStatement();
	              ResultSet rs=st.executeQuery("select * from Alien");
	              while(rs.next()==true)
	              {
	            	  String s1=rs.getString(1);
	            	  String s2=rs.getString(2);
	              
	              System.out.print(s1+" "+s2);
	              }
	
	
}

	
}
