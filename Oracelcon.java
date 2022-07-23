/* import the required file*/
import java.sql.*;
public class Oracelcon {
	public static void main(String[] args)
	{
		try
		{
			/*load driver*/
				Class.forName("oracle.jdbc.driver.OracleDriver");
			/*create connection*/
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","system");
		   /*create a statement for future use*/
				Statement az=con.createStatement();
				System.out.println("succefully connected to oracle");
		}
		/*it tells the error if occur*/
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}

}
