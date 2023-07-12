package arithmetic;

import java.sql.Connection;
import java.sql.DriverManager;

public class ravi {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
try {
	Class c = Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			System.out.println("Connection Established Successfully");

			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(e);
			}		
		}
	
		}
	


