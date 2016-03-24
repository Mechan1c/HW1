package lesson5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

public class PersonListRea
{

	public static void main(String[] args) throws SQLException
	{
		int a = numberOfCitizens();
		int b = getAvgAge();
		ArrayList<String> c = getLastnames();
		//printLastNameCount();
ArrayList<String> d = getWhereB();
System.out.println(Arrays.asList(d));
	}

	private static ArrayList<String> getWhereB() throws SQLException
	{
		ArrayList<String> arr = new ArrayList<>();
		Connection con = DriverManager.getConnection("jdbc:h2:~/test","sa","");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT LASTNAME FROM PERSON WHERE LASTNAME LIKE '_%b%_' ");
		while(rs.next())
		{
			arr.add(rs.getString(1));
		}
		return arr;
	}

	private static void printLastNameCount() throws SQLException
	{
		Connection con = DriverManager.getConnection("jdbc:h2:~/test","sa","");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT LASTNAME , COUNT(*) FROM PERSON GROUP BY LASTNAME");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getInt(2));
			//arr.add( new Person(, rs.getString("FNAME"), rs.getString("LNAME"), rs.getInt("AGE")) );
		}

	}

	private static int getAvgAge() throws SQLException
	{
		int avg=0;
		Connection con = DriverManager.getConnection("jdbc:h2:~/test","sa","");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT AVG(AGE) FROM PERSON ;");
		while(rs.next())
		{
			avg = rs.getInt(1);
		}
		return avg;
	}

	private static int numberOfCitizens() throws SQLException
	{
		int sum=0;
		Connection con = DriverManager.getConnection("jdbc:h2:~/test","sa","");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT COUNT(ID) FROM PERSON ");
		while(rs.next())
		{
			sum = rs.getInt(1);
		}
		return sum;
	}
	private static ArrayList<String> getLastnames() throws SQLException
	{
		ArrayList<String> arr = new ArrayList<>();
		Connection con = DriverManager.getConnection("jdbc:h2:~/test","sa","");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT DISTINCT LASTNAME FROM PERSON	ORDER BY LASTNAME;");
		while(rs.next())
		{
			arr.add(rs.getString(1));
		}
		return arr;
	}
}
