package demoForJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		//---STEP-1 Load and Register the driver
			 Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		
		//---STEP-2 Establish connection with the database
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_trial","root","Root");
			
		//---STEP-3 Create the statement object
			Statement st=con.createStatement();
			
		//---STEP-4 Prepare, send and execute the queries
			ResultSet rs=st.executeQuery("Select * from crud_trial.user");
			
		//---STEP-5 Process the data
			while(rs.next())
			{
				System.out.println(rs.getInt("id")+"\t"+
									rs.getString("user_name")+"\t"+
									rs.getString("contact_number")+"\t"+
									rs.getString("email")+"\t"+
									rs.getString("contact_no")+"\t"+
									rs.getString("email")+"\t"+
									rs.getString("name"));
			}
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();		}
		

	}

}
