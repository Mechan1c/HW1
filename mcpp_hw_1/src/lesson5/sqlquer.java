package lesson5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import lesson4.Person;

public class sqlquer
{

	public static void main(String[] args) throws SQLException 
	{
		Person pers = new Person(26,"Darka","Derkach", 21);
		updateTB(pers);
		//createTB();
		deleteRow(pers);
	}
	
	 private static void createTB() throws SQLException
	{
		
		Connection con = DriverManager.getConnection("jdbc:h2:~/test","sa","");
		Statement st = con.createStatement();
		int rs = st.executeUpdate("CREATE TABLE NewTable (Id INT, Name VARCHAR)");
		
	}
	 
	private static void updateTB (Person pers) throws SQLException
	{
		
		Connection con = DriverManager.getConnection("jdbc:h2:~/test","sa","");
		Statement st = con.createStatement();
		st.executeUpdate("INSERT INTO KILLERSDB VALUES(" + pers.id+ ", '"+ pers.fname +"', '"+pers.lname+"', "+pers.age+")" );
		st.close();
		con.close();
		
	}
	private static void deleteRow (Person pers) throws SQLException
	{
		
		Connection con = DriverManager.getConnection("jdbc:h2:~/test","sa","");
		Statement st = con.createStatement();
		st.executeUpdate("DELETE FROM KILLERSDB WHERE ID = "+pers.id );
		st.close();
		con.close();
		
	}
	 public static void UpdatePersonsH2(Person pers) throws SQLException 
	 {
		 
	  Connection Con = DriverManager.getConnection("jdbc:h2:~/test","sa","");
	  PreparedStatement st = Con.prepareStatement("UPDATE KILLERSDB SET fname = ?, lname = ?, age = ? WHERE id = ?");
	  
	  st.setString(1, pers.fname);
	  st.setString(2, pers.lname);
	  st.setInt(3, pers.age);
	  st.setInt(4, pers.id);
	  st.executeUpdate();
	  
	  Con.close();
	 }
	 
}
