package abc;
import java.sql.*;
public class Values {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Sandhya","root","P@ssw0rd");
		Statement st=con.createStatement();
		st.execute("insert into test values(121,'Sandhya')");
		System.out.println("Record inserted");
		st.close();
		con.close();

	}

}
