package abc;
import java.sql.*;
public class Connect {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sandhya","root","P@ssw0rd");
		Statement st=con.createStatement();
		st.execute("create table patients(id int,name varchar(20))");
		System.out.println("Table Created");
		st.close();
		con.close();

	}

}